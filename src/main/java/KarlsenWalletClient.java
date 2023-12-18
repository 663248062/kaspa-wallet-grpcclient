import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import karlsenwalletd.Karlsenwalletd;
import karlsenwalletd.karlsenwalletdGrpc;
import kaspawalletd.Kaspawalletd;
import kaspawalletd.kaspawalletdGrpc;

import java.math.BigDecimal;

/**
 * @Date 2022/7/13
 */
public class KarlsenWalletClient {

    private karlsenwalletdGrpc.karlsenwalletdBlockingStub karlsenwalletdStub;

    private KarlsenWalletClient(karlsenwalletdGrpc.karlsenwalletdBlockingStub karlsenwalletdStub) {
        this.karlsenwalletdStub = karlsenwalletdStub;
    }

    public static KarlsenWalletClient connect(String ip, int port) throws Exception {
        try {
            ManagedChannel channel = ManagedChannelBuilder.forAddress(ip, port).usePlaintext().build();
            return new KarlsenWalletClient(karlsenwalletdGrpc.newBlockingStub(channel));
        } catch (Exception ex) {
            String errMsg = String.format("Connect to [%s:%d] exception. cause: %s", ip, port, ex.getMessage());
            throw new Exception(errMsg);
        }
    }

    /**
     * 获取钱包余额
     *
     * @return
     */
    public BigDecimal getBalance() {
        BigDecimal balance = BigDecimal.ZERO;
        Karlsenwalletd.GetBalanceRequest getBalanceRequest = Karlsenwalletd.GetBalanceRequest.newBuilder().build();
        Karlsenwalletd.GetBalanceResponse getBalanceResponse = karlsenwalletdStub.getBalance(getBalanceRequest);
        if (getBalanceResponse != null) {
            return BigDecimal.valueOf(getBalanceResponse.getAvailable());
        }

        return balance;
    }

    /**
     * 转账
     *
     * @param toAddress
     * @param amount
     * @param password
     */
    public String transfer(String toAddress, BigDecimal amount, String password) {
        Karlsenwalletd.SendRequest sendRequest = Karlsenwalletd.SendRequest.newBuilder()
                .setToAddress(toAddress)
                .setAmount(amount.longValue())
                .setPassword(password)
                .build();
        Karlsenwalletd.SendResponse sendResponse = karlsenwalletdStub.send(sendRequest);
        if (sendResponse != null) {
            if (sendResponse.getTxIDsCount() > 0) {
                return sendResponse.getTxIDs(0);
            }
        }

        return "";
    }

    public static void main(String[] args) throws Exception {
        KarlsenWalletClient walletClient = KarlsenWalletClient.connect("", 8092);
        System.out.println(walletClient.getBalance().divide(BigDecimal.valueOf(1E8)));

        // transfer

//        String txId = walletClient.transfer("karlsen:qq8sqz075fk0gvt9uy29hf6uzhncpmlshrwsprp8k8k5n3zga7whjjtcwgf0k",
//                BigDecimal.valueOf(1).multiply(BigDecimal.valueOf(1E8)),
//                "");
        // System.out.println(txId);
    }
}

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import kaspawalletd.Kaspawalletd;
import kaspawalletd.kaspawalletdGrpc;

import java.math.BigDecimal;
import java.util.Optional;

/**
 * @Date 2022/7/13
 */
public class WalletClient {

    private kaspawalletdGrpc.kaspawalletdBlockingStub kaspawalletdStub;

    private WalletClient(kaspawalletdGrpc.kaspawalletdBlockingStub kaspawalletdStub) {
        this.kaspawalletdStub = kaspawalletdStub;
    }

    public static WalletClient connect(String ip, int port) throws Exception {
        try {
            ManagedChannel channel = ManagedChannelBuilder.forAddress(ip, port).usePlaintext().build();
            return new WalletClient(kaspawalletdGrpc.newBlockingStub(channel));
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
        Kaspawalletd.GetBalanceRequest getBalanceRequest = Kaspawalletd.GetBalanceRequest.newBuilder().build();
        Kaspawalletd.GetBalanceResponse getBalanceResponse = kaspawalletdStub.getBalance(getBalanceRequest);
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
        Kaspawalletd.SendRequest sendRequest = Kaspawalletd.SendRequest.newBuilder()
                .setToAddress(toAddress)
                .setAmount(amount.longValue())
                .setPassword(password)
                .build();
        Kaspawalletd.SendResponse sendResponse = kaspawalletdStub.send(sendRequest);
        if (sendResponse != null) {
            if (sendResponse.getTxIDsCount() > 0) {
                return sendResponse.getTxIDs(0);
            }
        }

        return "";
    }

    public static void main(String[] args) throws Exception {
        WalletClient walletClient = WalletClient.connect("", 8082);
        System.out.println(walletClient.getBalance().divide(BigDecimal.valueOf(1E8)));

        // transfer

        String txId = walletClient.transfer("kaspatest:qqu9t9azlq4e8nrmmtr0heuqnd8vcs5yxkdx0u0upqlg8hdrfv47wuqdurlpw",
                BigDecimal.valueOf(5).multiply(BigDecimal.valueOf(1E8)),
                "xxxxxx");
        System.out.println(txId);
    }
}

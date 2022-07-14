package kaspawalletd;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: kaspawalletd.proto")
public final class kaspawalletdGrpc {

  private kaspawalletdGrpc() {}

  public static final String SERVICE_NAME = "kaspawalletd.kaspawalletd";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<kaspawalletd.Kaspawalletd.GetBalanceRequest,
      kaspawalletd.Kaspawalletd.GetBalanceResponse> getGetBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBalance",
      requestType = kaspawalletd.Kaspawalletd.GetBalanceRequest.class,
      responseType = kaspawalletd.Kaspawalletd.GetBalanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kaspawalletd.Kaspawalletd.GetBalanceRequest,
      kaspawalletd.Kaspawalletd.GetBalanceResponse> getGetBalanceMethod() {
    io.grpc.MethodDescriptor<kaspawalletd.Kaspawalletd.GetBalanceRequest, kaspawalletd.Kaspawalletd.GetBalanceResponse> getGetBalanceMethod;
    if ((getGetBalanceMethod = kaspawalletdGrpc.getGetBalanceMethod) == null) {
      synchronized (kaspawalletdGrpc.class) {
        if ((getGetBalanceMethod = kaspawalletdGrpc.getGetBalanceMethod) == null) {
          kaspawalletdGrpc.getGetBalanceMethod = getGetBalanceMethod =
              io.grpc.MethodDescriptor.<kaspawalletd.Kaspawalletd.GetBalanceRequest, kaspawalletd.Kaspawalletd.GetBalanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kaspawalletd.Kaspawalletd.GetBalanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kaspawalletd.Kaspawalletd.GetBalanceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new kaspawalletdMethodDescriptorSupplier("GetBalance"))
              .build();
        }
      }
    }
    return getGetBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kaspawalletd.Kaspawalletd.SendRequest,
      kaspawalletd.Kaspawalletd.SendResponse> getSendMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Send",
      requestType = kaspawalletd.Kaspawalletd.SendRequest.class,
      responseType = kaspawalletd.Kaspawalletd.SendResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kaspawalletd.Kaspawalletd.SendRequest,
      kaspawalletd.Kaspawalletd.SendResponse> getSendMethod() {
    io.grpc.MethodDescriptor<kaspawalletd.Kaspawalletd.SendRequest, kaspawalletd.Kaspawalletd.SendResponse> getSendMethod;
    if ((getSendMethod = kaspawalletdGrpc.getSendMethod) == null) {
      synchronized (kaspawalletdGrpc.class) {
        if ((getSendMethod = kaspawalletdGrpc.getSendMethod) == null) {
          kaspawalletdGrpc.getSendMethod = getSendMethod =
              io.grpc.MethodDescriptor.<kaspawalletd.Kaspawalletd.SendRequest, kaspawalletd.Kaspawalletd.SendResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Send"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kaspawalletd.Kaspawalletd.SendRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kaspawalletd.Kaspawalletd.SendResponse.getDefaultInstance()))
              .setSchemaDescriptor(new kaspawalletdMethodDescriptorSupplier("Send"))
              .build();
        }
      }
    }
    return getSendMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static kaspawalletdStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<kaspawalletdStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<kaspawalletdStub>() {
        @java.lang.Override
        public kaspawalletdStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new kaspawalletdStub(channel, callOptions);
        }
      };
    return kaspawalletdStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static kaspawalletdBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<kaspawalletdBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<kaspawalletdBlockingStub>() {
        @java.lang.Override
        public kaspawalletdBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new kaspawalletdBlockingStub(channel, callOptions);
        }
      };
    return kaspawalletdBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static kaspawalletdFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<kaspawalletdFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<kaspawalletdFutureStub>() {
        @java.lang.Override
        public kaspawalletdFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new kaspawalletdFutureStub(channel, callOptions);
        }
      };
    return kaspawalletdFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class kaspawalletdImplBase implements io.grpc.BindableService {

    /**
     */
    public void getBalance(kaspawalletd.Kaspawalletd.GetBalanceRequest request,
        io.grpc.stub.StreamObserver<kaspawalletd.Kaspawalletd.GetBalanceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBalanceMethod(), responseObserver);
    }

    /**
     */
    public void send(kaspawalletd.Kaspawalletd.SendRequest request,
        io.grpc.stub.StreamObserver<kaspawalletd.Kaspawalletd.SendResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSendMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetBalanceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kaspawalletd.Kaspawalletd.GetBalanceRequest,
                kaspawalletd.Kaspawalletd.GetBalanceResponse>(
                  this, METHODID_GET_BALANCE)))
          .addMethod(
            getSendMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                kaspawalletd.Kaspawalletd.SendRequest,
                kaspawalletd.Kaspawalletd.SendResponse>(
                  this, METHODID_SEND)))
          .build();
    }
  }

  /**
   */
  public static final class kaspawalletdStub extends io.grpc.stub.AbstractAsyncStub<kaspawalletdStub> {
    private kaspawalletdStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected kaspawalletdStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new kaspawalletdStub(channel, callOptions);
    }

    /**
     */
    public void getBalance(kaspawalletd.Kaspawalletd.GetBalanceRequest request,
        io.grpc.stub.StreamObserver<kaspawalletd.Kaspawalletd.GetBalanceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void send(kaspawalletd.Kaspawalletd.SendRequest request,
        io.grpc.stub.StreamObserver<kaspawalletd.Kaspawalletd.SendResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class kaspawalletdBlockingStub extends io.grpc.stub.AbstractBlockingStub<kaspawalletdBlockingStub> {
    private kaspawalletdBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected kaspawalletdBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new kaspawalletdBlockingStub(channel, callOptions);
    }

    /**
     */
    public kaspawalletd.Kaspawalletd.GetBalanceResponse getBalance(kaspawalletd.Kaspawalletd.GetBalanceRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetBalanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public kaspawalletd.Kaspawalletd.SendResponse send(kaspawalletd.Kaspawalletd.SendRequest request) {
      return blockingUnaryCall(
          getChannel(), getSendMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class kaspawalletdFutureStub extends io.grpc.stub.AbstractFutureStub<kaspawalletdFutureStub> {
    private kaspawalletdFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected kaspawalletdFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new kaspawalletdFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<kaspawalletd.Kaspawalletd.GetBalanceResponse> getBalance(
        kaspawalletd.Kaspawalletd.GetBalanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBalanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<kaspawalletd.Kaspawalletd.SendResponse> send(
        kaspawalletd.Kaspawalletd.SendRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSendMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_BALANCE = 0;
  private static final int METHODID_SEND = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final kaspawalletdImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(kaspawalletdImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_BALANCE:
          serviceImpl.getBalance((kaspawalletd.Kaspawalletd.GetBalanceRequest) request,
              (io.grpc.stub.StreamObserver<kaspawalletd.Kaspawalletd.GetBalanceResponse>) responseObserver);
          break;
        case METHODID_SEND:
          serviceImpl.send((kaspawalletd.Kaspawalletd.SendRequest) request,
              (io.grpc.stub.StreamObserver<kaspawalletd.Kaspawalletd.SendResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class kaspawalletdBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    kaspawalletdBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return kaspawalletd.Kaspawalletd.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("kaspawalletd");
    }
  }

  private static final class kaspawalletdFileDescriptorSupplier
      extends kaspawalletdBaseDescriptorSupplier {
    kaspawalletdFileDescriptorSupplier() {}
  }

  private static final class kaspawalletdMethodDescriptorSupplier
      extends kaspawalletdBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    kaspawalletdMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (kaspawalletdGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new kaspawalletdFileDescriptorSupplier())
              .addMethod(getGetBalanceMethod())
              .addMethod(getSendMethod())
              .build();
        }
      }
    }
    return result;
  }
}

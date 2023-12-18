package karlsenwalletd;

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
    comments = "Source: karlsenwalletd.proto")
public final class karlsenwalletdGrpc {

  private karlsenwalletdGrpc() {}

  public static final String SERVICE_NAME = "karlsenwalletd.karlsenwalletd";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<karlsenwalletd.Karlsenwalletd.GetBalanceRequest,
      karlsenwalletd.Karlsenwalletd.GetBalanceResponse> getGetBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBalance",
      requestType = karlsenwalletd.Karlsenwalletd.GetBalanceRequest.class,
      responseType = karlsenwalletd.Karlsenwalletd.GetBalanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<karlsenwalletd.Karlsenwalletd.GetBalanceRequest,
      karlsenwalletd.Karlsenwalletd.GetBalanceResponse> getGetBalanceMethod() {
    io.grpc.MethodDescriptor<karlsenwalletd.Karlsenwalletd.GetBalanceRequest, karlsenwalletd.Karlsenwalletd.GetBalanceResponse> getGetBalanceMethod;
    if ((getGetBalanceMethod = karlsenwalletdGrpc.getGetBalanceMethod) == null) {
      synchronized (karlsenwalletdGrpc.class) {
        if ((getGetBalanceMethod = karlsenwalletdGrpc.getGetBalanceMethod) == null) {
          karlsenwalletdGrpc.getGetBalanceMethod = getGetBalanceMethod =
              io.grpc.MethodDescriptor.<karlsenwalletd.Karlsenwalletd.GetBalanceRequest, karlsenwalletd.Karlsenwalletd.GetBalanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  karlsenwalletd.Karlsenwalletd.GetBalanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  karlsenwalletd.Karlsenwalletd.GetBalanceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new karlsenwalletdMethodDescriptorSupplier("GetBalance"))
              .build();
        }
      }
    }
    return getGetBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<karlsenwalletd.Karlsenwalletd.SendRequest,
      karlsenwalletd.Karlsenwalletd.SendResponse> getSendMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Send",
      requestType = karlsenwalletd.Karlsenwalletd.SendRequest.class,
      responseType = karlsenwalletd.Karlsenwalletd.SendResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<karlsenwalletd.Karlsenwalletd.SendRequest,
      karlsenwalletd.Karlsenwalletd.SendResponse> getSendMethod() {
    io.grpc.MethodDescriptor<karlsenwalletd.Karlsenwalletd.SendRequest, karlsenwalletd.Karlsenwalletd.SendResponse> getSendMethod;
    if ((getSendMethod = karlsenwalletdGrpc.getSendMethod) == null) {
      synchronized (karlsenwalletdGrpc.class) {
        if ((getSendMethod = karlsenwalletdGrpc.getSendMethod) == null) {
          karlsenwalletdGrpc.getSendMethod = getSendMethod =
              io.grpc.MethodDescriptor.<karlsenwalletd.Karlsenwalletd.SendRequest, karlsenwalletd.Karlsenwalletd.SendResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Send"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  karlsenwalletd.Karlsenwalletd.SendRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  karlsenwalletd.Karlsenwalletd.SendResponse.getDefaultInstance()))
              .setSchemaDescriptor(new karlsenwalletdMethodDescriptorSupplier("Send"))
              .build();
        }
      }
    }
    return getSendMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static karlsenwalletdStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<karlsenwalletdStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<karlsenwalletdStub>() {
        @java.lang.Override
        public karlsenwalletdStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new karlsenwalletdStub(channel, callOptions);
        }
      };
    return karlsenwalletdStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static karlsenwalletdBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<karlsenwalletdBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<karlsenwalletdBlockingStub>() {
        @java.lang.Override
        public karlsenwalletdBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new karlsenwalletdBlockingStub(channel, callOptions);
        }
      };
    return karlsenwalletdBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static karlsenwalletdFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<karlsenwalletdFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<karlsenwalletdFutureStub>() {
        @java.lang.Override
        public karlsenwalletdFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new karlsenwalletdFutureStub(channel, callOptions);
        }
      };
    return karlsenwalletdFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class karlsenwalletdImplBase implements io.grpc.BindableService {

    /**
     */
    public void getBalance(karlsenwalletd.Karlsenwalletd.GetBalanceRequest request,
        io.grpc.stub.StreamObserver<karlsenwalletd.Karlsenwalletd.GetBalanceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBalanceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Since SendRequest contains a password - this command should only be used on a trusted or secure connection
     * </pre>
     */
    public void send(karlsenwalletd.Karlsenwalletd.SendRequest request,
        io.grpc.stub.StreamObserver<karlsenwalletd.Karlsenwalletd.SendResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSendMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetBalanceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                karlsenwalletd.Karlsenwalletd.GetBalanceRequest,
                karlsenwalletd.Karlsenwalletd.GetBalanceResponse>(
                  this, METHODID_GET_BALANCE)))
          .addMethod(
            getSendMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                karlsenwalletd.Karlsenwalletd.SendRequest,
                karlsenwalletd.Karlsenwalletd.SendResponse>(
                  this, METHODID_SEND)))
          .build();
    }
  }

  /**
   */
  public static final class karlsenwalletdStub extends io.grpc.stub.AbstractAsyncStub<karlsenwalletdStub> {
    private karlsenwalletdStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected karlsenwalletdStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new karlsenwalletdStub(channel, callOptions);
    }

    /**
     */
    public void getBalance(karlsenwalletd.Karlsenwalletd.GetBalanceRequest request,
        io.grpc.stub.StreamObserver<karlsenwalletd.Karlsenwalletd.GetBalanceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Since SendRequest contains a password - this command should only be used on a trusted or secure connection
     * </pre>
     */
    public void send(karlsenwalletd.Karlsenwalletd.SendRequest request,
        io.grpc.stub.StreamObserver<karlsenwalletd.Karlsenwalletd.SendResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class karlsenwalletdBlockingStub extends io.grpc.stub.AbstractBlockingStub<karlsenwalletdBlockingStub> {
    private karlsenwalletdBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected karlsenwalletdBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new karlsenwalletdBlockingStub(channel, callOptions);
    }

    /**
     */
    public karlsenwalletd.Karlsenwalletd.GetBalanceResponse getBalance(karlsenwalletd.Karlsenwalletd.GetBalanceRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetBalanceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Since SendRequest contains a password - this command should only be used on a trusted or secure connection
     * </pre>
     */
    public karlsenwalletd.Karlsenwalletd.SendResponse send(karlsenwalletd.Karlsenwalletd.SendRequest request) {
      return blockingUnaryCall(
          getChannel(), getSendMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class karlsenwalletdFutureStub extends io.grpc.stub.AbstractFutureStub<karlsenwalletdFutureStub> {
    private karlsenwalletdFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected karlsenwalletdFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new karlsenwalletdFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<karlsenwalletd.Karlsenwalletd.GetBalanceResponse> getBalance(
        karlsenwalletd.Karlsenwalletd.GetBalanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBalanceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Since SendRequest contains a password - this command should only be used on a trusted or secure connection
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<karlsenwalletd.Karlsenwalletd.SendResponse> send(
        karlsenwalletd.Karlsenwalletd.SendRequest request) {
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
    private final karlsenwalletdImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(karlsenwalletdImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_BALANCE:
          serviceImpl.getBalance((karlsenwalletd.Karlsenwalletd.GetBalanceRequest) request,
              (io.grpc.stub.StreamObserver<karlsenwalletd.Karlsenwalletd.GetBalanceResponse>) responseObserver);
          break;
        case METHODID_SEND:
          serviceImpl.send((karlsenwalletd.Karlsenwalletd.SendRequest) request,
              (io.grpc.stub.StreamObserver<karlsenwalletd.Karlsenwalletd.SendResponse>) responseObserver);
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

  private static abstract class karlsenwalletdBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    karlsenwalletdBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return karlsenwalletd.Karlsenwalletd.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("karlsenwalletd");
    }
  }

  private static final class karlsenwalletdFileDescriptorSupplier
      extends karlsenwalletdBaseDescriptorSupplier {
    karlsenwalletdFileDescriptorSupplier() {}
  }

  private static final class karlsenwalletdMethodDescriptorSupplier
      extends karlsenwalletdBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    karlsenwalletdMethodDescriptorSupplier(String methodName) {
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
      synchronized (karlsenwalletdGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new karlsenwalletdFileDescriptorSupplier())
              .addMethod(getGetBalanceMethod())
              .addMethod(getSendMethod())
              .build();
        }
      }
    }
    return result;
  }
}

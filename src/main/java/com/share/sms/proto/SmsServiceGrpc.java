package com.share.sms.proto;

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
    value = "by gRPC proto compiler (version 1.11.0)",
    comments = "Source: sms.proto")
public final class SmsServiceGrpc {

  private SmsServiceGrpc() {}

  public static final String SERVICE_NAME = "sms.SmsService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSendSmsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.share.sms.proto.SmsProto.SmsRequest,
      com.share.sms.proto.SmsProto.SmsResponse> METHOD_SEND_SMS = getSendSmsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.share.sms.proto.SmsProto.SmsRequest,
      com.share.sms.proto.SmsProto.SmsResponse> getSendSmsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.share.sms.proto.SmsProto.SmsRequest,
      com.share.sms.proto.SmsProto.SmsResponse> getSendSmsMethod() {
    return getSendSmsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.share.sms.proto.SmsProto.SmsRequest,
      com.share.sms.proto.SmsProto.SmsResponse> getSendSmsMethodHelper() {
    io.grpc.MethodDescriptor<com.share.sms.proto.SmsProto.SmsRequest, com.share.sms.proto.SmsProto.SmsResponse> getSendSmsMethod;
    if ((getSendSmsMethod = SmsServiceGrpc.getSendSmsMethod) == null) {
      synchronized (SmsServiceGrpc.class) {
        if ((getSendSmsMethod = SmsServiceGrpc.getSendSmsMethod) == null) {
          SmsServiceGrpc.getSendSmsMethod = getSendSmsMethod = 
              io.grpc.MethodDescriptor.<com.share.sms.proto.SmsProto.SmsRequest, com.share.sms.proto.SmsProto.SmsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "sms.SmsService", "sendSms"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.share.sms.proto.SmsProto.SmsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.share.sms.proto.SmsProto.SmsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SmsServiceMethodDescriptorSupplier("sendSms"))
                  .build();
          }
        }
     }
     return getSendSmsMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCreatePhoneMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.share.sms.proto.SmsProto.PhoneNumberRequest,
      com.share.sms.proto.SmsProto.PhoneNumberResponse> METHOD_CREATE_PHONE = getCreatePhoneMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.share.sms.proto.SmsProto.PhoneNumberRequest,
      com.share.sms.proto.SmsProto.PhoneNumberResponse> getCreatePhoneMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.share.sms.proto.SmsProto.PhoneNumberRequest,
      com.share.sms.proto.SmsProto.PhoneNumberResponse> getCreatePhoneMethod() {
    return getCreatePhoneMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.share.sms.proto.SmsProto.PhoneNumberRequest,
      com.share.sms.proto.SmsProto.PhoneNumberResponse> getCreatePhoneMethodHelper() {
    io.grpc.MethodDescriptor<com.share.sms.proto.SmsProto.PhoneNumberRequest, com.share.sms.proto.SmsProto.PhoneNumberResponse> getCreatePhoneMethod;
    if ((getCreatePhoneMethod = SmsServiceGrpc.getCreatePhoneMethod) == null) {
      synchronized (SmsServiceGrpc.class) {
        if ((getCreatePhoneMethod = SmsServiceGrpc.getCreatePhoneMethod) == null) {
          SmsServiceGrpc.getCreatePhoneMethod = getCreatePhoneMethod = 
              io.grpc.MethodDescriptor.<com.share.sms.proto.SmsProto.PhoneNumberRequest, com.share.sms.proto.SmsProto.PhoneNumberResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "sms.SmsService", "createPhone"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.share.sms.proto.SmsProto.PhoneNumberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.share.sms.proto.SmsProto.PhoneNumberResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SmsServiceMethodDescriptorSupplier("createPhone"))
                  .build();
          }
        }
     }
     return getCreatePhoneMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCreateAndSendSmsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.share.sms.proto.SmsProto.PhoneNumberRequest,
      com.share.sms.proto.SmsProto.PhoneNumberResponse> METHOD_CREATE_AND_SEND_SMS = getCreateAndSendSmsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.share.sms.proto.SmsProto.PhoneNumberRequest,
      com.share.sms.proto.SmsProto.PhoneNumberResponse> getCreateAndSendSmsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.share.sms.proto.SmsProto.PhoneNumberRequest,
      com.share.sms.proto.SmsProto.PhoneNumberResponse> getCreateAndSendSmsMethod() {
    return getCreateAndSendSmsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.share.sms.proto.SmsProto.PhoneNumberRequest,
      com.share.sms.proto.SmsProto.PhoneNumberResponse> getCreateAndSendSmsMethodHelper() {
    io.grpc.MethodDescriptor<com.share.sms.proto.SmsProto.PhoneNumberRequest, com.share.sms.proto.SmsProto.PhoneNumberResponse> getCreateAndSendSmsMethod;
    if ((getCreateAndSendSmsMethod = SmsServiceGrpc.getCreateAndSendSmsMethod) == null) {
      synchronized (SmsServiceGrpc.class) {
        if ((getCreateAndSendSmsMethod = SmsServiceGrpc.getCreateAndSendSmsMethod) == null) {
          SmsServiceGrpc.getCreateAndSendSmsMethod = getCreateAndSendSmsMethod = 
              io.grpc.MethodDescriptor.<com.share.sms.proto.SmsProto.PhoneNumberRequest, com.share.sms.proto.SmsProto.PhoneNumberResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "sms.SmsService", "createAndSendSms"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.share.sms.proto.SmsProto.PhoneNumberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.share.sms.proto.SmsProto.PhoneNumberResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SmsServiceMethodDescriptorSupplier("createAndSendSms"))
                  .build();
          }
        }
     }
     return getCreateAndSendSmsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SmsServiceStub newStub(io.grpc.Channel channel) {
    return new SmsServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SmsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SmsServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SmsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SmsServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class SmsServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void sendSms(com.share.sms.proto.SmsProto.SmsRequest request,
        io.grpc.stub.StreamObserver<com.share.sms.proto.SmsProto.SmsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSendSmsMethodHelper(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.share.sms.proto.SmsProto.PhoneNumberRequest> createPhone(
        io.grpc.stub.StreamObserver<com.share.sms.proto.SmsProto.PhoneNumberResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getCreatePhoneMethodHelper(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.share.sms.proto.SmsProto.PhoneNumberRequest> createAndSendSms(
        io.grpc.stub.StreamObserver<com.share.sms.proto.SmsProto.PhoneNumberResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getCreateAndSendSmsMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendSmsMethodHelper(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.share.sms.proto.SmsProto.SmsRequest,
                com.share.sms.proto.SmsProto.SmsResponse>(
                  this, METHODID_SEND_SMS)))
          .addMethod(
            getCreatePhoneMethodHelper(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.share.sms.proto.SmsProto.PhoneNumberRequest,
                com.share.sms.proto.SmsProto.PhoneNumberResponse>(
                  this, METHODID_CREATE_PHONE)))
          .addMethod(
            getCreateAndSendSmsMethodHelper(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.share.sms.proto.SmsProto.PhoneNumberRequest,
                com.share.sms.proto.SmsProto.PhoneNumberResponse>(
                  this, METHODID_CREATE_AND_SEND_SMS)))
          .build();
    }
  }

  /**
   */
  public static final class SmsServiceStub extends io.grpc.stub.AbstractStub<SmsServiceStub> {
    private SmsServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmsServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmsServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmsServiceStub(channel, callOptions);
    }

    /**
     */
    public void sendSms(com.share.sms.proto.SmsProto.SmsRequest request,
        io.grpc.stub.StreamObserver<com.share.sms.proto.SmsProto.SmsResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSendSmsMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.share.sms.proto.SmsProto.PhoneNumberRequest> createPhone(
        io.grpc.stub.StreamObserver<com.share.sms.proto.SmsProto.PhoneNumberResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getCreatePhoneMethodHelper(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.share.sms.proto.SmsProto.PhoneNumberRequest> createAndSendSms(
        io.grpc.stub.StreamObserver<com.share.sms.proto.SmsProto.PhoneNumberResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getCreateAndSendSmsMethodHelper(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class SmsServiceBlockingStub extends io.grpc.stub.AbstractStub<SmsServiceBlockingStub> {
    private SmsServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmsServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmsServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmsServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<com.share.sms.proto.SmsProto.SmsResponse> sendSms(
        com.share.sms.proto.SmsProto.SmsRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getSendSmsMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SmsServiceFutureStub extends io.grpc.stub.AbstractStub<SmsServiceFutureStub> {
    private SmsServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmsServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmsServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmsServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_SEND_SMS = 0;
  private static final int METHODID_CREATE_PHONE = 1;
  private static final int METHODID_CREATE_AND_SEND_SMS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SmsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SmsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_SMS:
          serviceImpl.sendSms((com.share.sms.proto.SmsProto.SmsRequest) request,
              (io.grpc.stub.StreamObserver<com.share.sms.proto.SmsProto.SmsResponse>) responseObserver);
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
        case METHODID_CREATE_PHONE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.createPhone(
              (io.grpc.stub.StreamObserver<com.share.sms.proto.SmsProto.PhoneNumberResponse>) responseObserver);
        case METHODID_CREATE_AND_SEND_SMS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.createAndSendSms(
              (io.grpc.stub.StreamObserver<com.share.sms.proto.SmsProto.PhoneNumberResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SmsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SmsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.share.sms.proto.SmsProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SmsService");
    }
  }

  private static final class SmsServiceFileDescriptorSupplier
      extends SmsServiceBaseDescriptorSupplier {
    SmsServiceFileDescriptorSupplier() {}
  }

  private static final class SmsServiceMethodDescriptorSupplier
      extends SmsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SmsServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SmsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SmsServiceFileDescriptorSupplier())
              .addMethod(getSendSmsMethodHelper())
              .addMethod(getCreatePhoneMethodHelper())
              .addMethod(getCreateAndSendSmsMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}

package com.share.news.proto;

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
 * <pre>
 *定义rpc服务的RouteGrade
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.11.0)",
    comments = "Source: news.proto")
public final class NewsServiceGrpc {

  private NewsServiceGrpc() {}

  public static final String SERVICE_NAME = "news.NewsService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @Deprecated // Use {@link #getListMethod()} instead.
  public static final io.grpc.MethodDescriptor<NewsProto.NewsRequest,
      NewsProto.NewsResponse> METHOD_LIST = getListMethodHelper();

  private static volatile io.grpc.MethodDescriptor<NewsProto.NewsRequest,
      NewsProto.NewsResponse> getListMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<NewsProto.NewsRequest,
      NewsProto.NewsResponse> getListMethod() {
    return getListMethodHelper();
  }

  private static io.grpc.MethodDescriptor<NewsProto.NewsRequest,
      NewsProto.NewsResponse> getListMethodHelper() {
    io.grpc.MethodDescriptor<NewsProto.NewsRequest, NewsProto.NewsResponse> getListMethod;
    if ((getListMethod = NewsServiceGrpc.getListMethod) == null) {
      synchronized (NewsServiceGrpc.class) {
        if ((getListMethod = NewsServiceGrpc.getListMethod) == null) {
          NewsServiceGrpc.getListMethod = getListMethod = 
              io.grpc.MethodDescriptor.<NewsProto.NewsRequest, NewsProto.NewsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "news.NewsService", "list"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  NewsProto.NewsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  NewsProto.NewsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new NewsServiceMethodDescriptorSupplier("list"))
                  .build();
          }
        }
     }
     return getListMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @Deprecated // Use {@link #getHelloMethod()} instead.
  public static final io.grpc.MethodDescriptor<NewsProto.StringRequest,
      NewsProto.StringResponse> METHOD_HELLO = getHelloMethodHelper();

  private static volatile io.grpc.MethodDescriptor<NewsProto.StringRequest,
      NewsProto.StringResponse> getHelloMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<NewsProto.StringRequest,
      NewsProto.StringResponse> getHelloMethod() {
    return getHelloMethodHelper();
  }

  private static io.grpc.MethodDescriptor<NewsProto.StringRequest,
      NewsProto.StringResponse> getHelloMethodHelper() {
    io.grpc.MethodDescriptor<NewsProto.StringRequest, NewsProto.StringResponse> getHelloMethod;
    if ((getHelloMethod = NewsServiceGrpc.getHelloMethod) == null) {
      synchronized (NewsServiceGrpc.class) {
        if ((getHelloMethod = NewsServiceGrpc.getHelloMethod) == null) {
          NewsServiceGrpc.getHelloMethod = getHelloMethod = 
              io.grpc.MethodDescriptor.<NewsProto.StringRequest, NewsProto.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "news.NewsService", "hello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  NewsProto.StringRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  NewsProto.StringResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new NewsServiceMethodDescriptorSupplier("hello"))
                  .build();
          }
        }
     }
     return getHelloMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NewsServiceStub newStub(io.grpc.Channel channel) {
    return new NewsServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NewsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new NewsServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NewsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new NewsServiceFutureStub(channel);
  }

  /**
   * <pre>
   *定义rpc服务的RouteGrade
   * </pre>
   */
  public static abstract class NewsServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *list 方法名，NewsRequest 传入参数，NewsResponse 返回参数
     * </pre>
     */
    public void list(NewsProto.NewsRequest request,
                     io.grpc.stub.StreamObserver<NewsProto.NewsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethodHelper(), responseObserver);
    }

    /**
     */
    public void hello(NewsProto.StringRequest request,
                      io.grpc.stub.StreamObserver<NewsProto.StringResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getHelloMethodHelper(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                NewsProto.NewsRequest,
                NewsProto.NewsResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getHelloMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                NewsProto.StringRequest,
                NewsProto.StringResponse>(
                  this, METHODID_HELLO)))
          .build();
    }
  }

  /**
   * <pre>
   *定义rpc服务的RouteGrade
   * </pre>
   */
  public static final class NewsServiceStub extends io.grpc.stub.AbstractStub<NewsServiceStub> {
    private NewsServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NewsServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected NewsServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NewsServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *list 方法名，NewsRequest 传入参数，NewsResponse 返回参数
     * </pre>
     */
    public void list(NewsProto.NewsRequest request,
                     io.grpc.stub.StreamObserver<NewsProto.NewsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void hello(NewsProto.StringRequest request,
                      io.grpc.stub.StreamObserver<NewsProto.StringResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHelloMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *定义rpc服务的RouteGrade
   * </pre>
   */
  public static final class NewsServiceBlockingStub extends io.grpc.stub.AbstractStub<NewsServiceBlockingStub> {
    private NewsServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NewsServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected NewsServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NewsServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *list 方法名，NewsRequest 传入参数，NewsResponse 返回参数
     * </pre>
     */
    public NewsProto.NewsResponse list(NewsProto.NewsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public NewsProto.StringResponse hello(NewsProto.StringRequest request) {
      return blockingUnaryCall(
          getChannel(), getHelloMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *定义rpc服务的RouteGrade
   * </pre>
   */
  public static final class NewsServiceFutureStub extends io.grpc.stub.AbstractStub<NewsServiceFutureStub> {
    private NewsServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NewsServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected NewsServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NewsServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *list 方法名，NewsRequest 传入参数，NewsResponse 返回参数
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<NewsProto.NewsResponse> list(
        NewsProto.NewsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<NewsProto.StringResponse> hello(
        NewsProto.StringRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getHelloMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST = 0;
  private static final int METHODID_HELLO = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NewsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NewsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((NewsProto.NewsRequest) request,
              (io.grpc.stub.StreamObserver<NewsProto.NewsResponse>) responseObserver);
          break;
        case METHODID_HELLO:
          serviceImpl.hello((NewsProto.StringRequest) request,
              (io.grpc.stub.StreamObserver<NewsProto.StringResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class NewsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NewsServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return NewsProto.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NewsService");
    }
  }

  private static final class NewsServiceFileDescriptorSupplier
      extends NewsServiceBaseDescriptorSupplier {
    NewsServiceFileDescriptorSupplier() {}
  }

  private static final class NewsServiceMethodDescriptorSupplier
      extends NewsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NewsServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (NewsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NewsServiceFileDescriptorSupplier())
              .addMethod(getListMethodHelper())
              .addMethod(getHelloMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}

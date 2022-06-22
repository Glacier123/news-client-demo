package com.share.sms;

import com.share.sms.proto.SmsProto;
import com.share.sms.proto.SmsServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

/**
 * 双向流式通信
 */
public class CreateAndSendClient {

    private SmsServiceGrpc.SmsServiceStub asyncStub = null;
    private static final String host = "localhost";
    private static final int port = 9000;

    public static void main(String[] args) {
        CreateAndSendClient createAndSendClient = new CreateAndSendClient();
        ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
        //客户端RPC流式通信必须建立异步stub事项
        createAndSendClient.asyncStub = SmsServiceGrpc.newStub(channel);
        try{
            createAndSendClient.createPhone();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void createPhone() throws InterruptedException {
        //实力化requestobject 发起请求
        StreamObserver<SmsProto.PhoneNumberRequest> requestStreamObserver = asyncStub.createAndSendSms(responseObserver);
        for (int i = 0; i < 10; i++) {
            //创建请求对象
            SmsProto.PhoneNumberRequest request = SmsProto.PhoneNumberRequest.newBuilder().setPhoneNumber(String.valueOf("15788888888" + i)).build();
            //发送请求
            requestStreamObserver.onNext(request);
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                requestStreamObserver.onError(e);
                throw e;
            }
        }
        requestStreamObserver.onCompleted();
        Thread.sleep(1000);

    }

    /**
     * 监听服务器返回的响应
     */
    StreamObserver<SmsProto.PhoneNumberResponse> responseObserver = new StreamObserver<SmsProto.PhoneNumberResponse>(){

        @Override
        public void onNext(SmsProto.PhoneNumberResponse phoneNumberResponse) {
            System.out.println(phoneNumberResponse.getResult());
        }

        @Override
        public void onError(Throwable throwable) {

        }

        @Override
        public void onCompleted() {
            System.out.println("处理完毕！");
        }
    };


}


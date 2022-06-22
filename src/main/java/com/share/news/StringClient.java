package com.share.news;

import com.share.news.proto.NewsProto;
import com.share.news.proto.NewsServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.List;

public class StringClient {
    private static final String host = "localhost";
    private static final int port = 9000;

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
        try {
            //阻塞模式（同步方式进行通信）
            NewsServiceGrpc.NewsServiceBlockingStub blockingStub = NewsServiceGrpc.newBlockingStub(channel);
            NewsProto.StringRequest request = NewsProto.StringRequest.newBuilder().setName("Andy").build();
            NewsProto.StringResponse response = blockingStub.hello(request);
            System.out.println(response.getResult());

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            channel.shutdown();
        }


    }
}

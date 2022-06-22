package com.share.news;

import com.share.news.proto.NewsProto;
import com.share.news.proto.NewsServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.List;

public class NewsClient {

    private static final String host = "localhost";
    private static final int port = 9000;

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
        try {
            //阻塞模式（同步方式进行通信）
            NewsServiceGrpc.NewsServiceBlockingStub newsServiceBlockingStub = NewsServiceGrpc.newBlockingStub(channel);
            NewsProto.NewsRequest request = NewsProto.NewsRequest.newBuilder().setDate("2022-06-19").build();
            NewsProto.NewsResponse response = newsServiceBlockingStub.list(request);
            List<NewsProto.News> newsList = response.getNewsList();
            for (NewsProto.News news : newsList) {
                System.out.println(news.getTitle()+":"+news.getContent());
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            channel.shutdown();
        }


    }
}

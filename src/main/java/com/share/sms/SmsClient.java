package com.share.sms;

import com.share.sms.proto.SmsProto;
import com.share.sms.proto.SmsServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.Iterator;

public class SmsClient {

    private static final String host = "localhost";
    private static final int port = 9000;

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
        SmsServiceGrpc.SmsServiceBlockingStub smsService = SmsServiceGrpc.newBlockingStub(channel);
        Iterator<SmsProto.SmsResponse> iterator = smsService.sendSms(SmsProto.SmsRequest.newBuilder()
                .setContent("下午三点开会")
                .addPhoneNumber("13812340001")
                .addPhoneNumber("13812340002")
                .addPhoneNumber("13812340003")
                .addPhoneNumber("13812340004")
                .addPhoneNumber("13812340005")
                .addPhoneNumber("13812340006")
                .addPhoneNumber("13812340007")
                .build());

        while (iterator.hasNext()){
            SmsProto.SmsResponse next = iterator.next();
            System.out.println(next.getResult());
        }
    }
}

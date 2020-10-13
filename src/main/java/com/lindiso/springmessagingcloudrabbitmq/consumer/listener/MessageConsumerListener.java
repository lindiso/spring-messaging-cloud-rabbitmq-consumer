package com.lindiso.springmessagingcloudrabbitmq.consumer.listener;

import com.lindiso.springmessagingcloudrabbitmq.consumer.MessageConsumer;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@EnableBinding(MessageConsumer.class)
public class MessageConsumerListener {

    @StreamListener(target = MessageConsumer.MESSAGE)
    public void handleMessageConsumer(String message) {
        System.out.println("======================Message : " + message);
    }
}

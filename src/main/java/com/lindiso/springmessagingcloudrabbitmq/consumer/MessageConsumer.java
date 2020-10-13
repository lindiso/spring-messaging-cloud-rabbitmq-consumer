package com.lindiso.springmessagingcloudrabbitmq.consumer;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface MessageConsumer {
    String MESSAGE = "greetings";

    @Input(MESSAGE)
    SubscribableChannel consumeMessage();
}

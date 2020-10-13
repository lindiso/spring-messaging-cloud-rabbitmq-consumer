package com.lindiso.springmessagingcloudrabbitmq;

import com.lindiso.springmessagingcloudrabbitmq.consumer.MessageConsumer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(MessageConsumer.class)
@SpringBootApplication
public class SpringMessagingConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMessagingConsumerApplication.class, args);

	}


}

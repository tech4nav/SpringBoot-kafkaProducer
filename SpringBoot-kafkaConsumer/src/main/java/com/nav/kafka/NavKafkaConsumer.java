package com.nav.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class NavKafkaConsumer {

	//@KafkaListener(topics = "NewTopic", groupId = "group_id")
	@KafkaListener(
			  topics = "NewTopic", 
			  containerFactory = "concurrentKafkaListenerContainerFactory")
    public void consume( NavUser usr)
    {
        System.out.println("Consuming  for usernamme = " + usr.getUserName() +" >>>>  and action is ="+usr.getAction());
    }
}

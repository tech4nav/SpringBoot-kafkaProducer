package com.nav.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NavKafkaProdController {


    @Autowired
    KafkaTemplate<String,NavUser> kafkaTemplate;

    private static final String TOPIC = "NewTopic";

    @PostMapping("/publish")
    public String publishMessage(@RequestBody NavUser nvusr)
    {
        kafkaTemplate.send(TOPIC, nvusr);
        return " User : "+nvusr.getUserName()+" and action : "+nvusr.getAction()+"   Published Successfully!";
    }
}

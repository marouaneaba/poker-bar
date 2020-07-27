package com.poker.api;

import kafka.topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import com.poker.kafka.KafkaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Autowired
	private KafkaService  kafkaService;

	@GetMapping("producter")
	public String testKafka(){
		Topic topic = new Topic("bar",0,(short)0);
		kafkaService.sendMessage(topic,"first message");
		return "message is send";
	}
}

package com.poker.kafka;

import kafka.producter.ProducterService;
import kafka.topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

@Service
@ComponentScan(basePackageClasses = kafka.producter.ProducterService.class)
public class KafkaService {

	@Autowired
	private ProducterService producterService;

	/**
	 * send stream to topic
	 * @param topic topic
	 * @param message  stream send to topic
	 */
	public void sendMessage(final Topic topic, String message){
		producterService.sendSynMessage(topic, message);
	}
}

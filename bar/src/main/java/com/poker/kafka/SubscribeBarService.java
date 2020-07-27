package com.poker.kafka;

import kafka.consumer.SubscribeKafkaInterface;

public class SubscribeBarService implements SubscribeKafkaInterface {

	@Override
	public void runTopicBar(String message, int partition) {
		System.out.println("message is: "+message);
	}
}

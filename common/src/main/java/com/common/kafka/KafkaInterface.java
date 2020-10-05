package com.common.kafka;

import com.common.kafka.topic.Topic;

public interface KafkaInterface {

	public void sendMessage(Topic topic, String message);

	public Topic createTopic(Topic topic);
}

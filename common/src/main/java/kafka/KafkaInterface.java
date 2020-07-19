package kafka;

import kafka.topic.Topic;

public interface KafkaInterface {

	public void sendMessage(Topic topic, String message);

	public Topic createTopic(Topic topic);
}

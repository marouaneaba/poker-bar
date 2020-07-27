package kafka.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

	@Autowired
	private SubscribeKafkaInterface subscribeKafkaInterface;

	@KafkaListener(topics = "topicBar")
	public void subscribeTopicName(@Payload String message,
			@Header(KafkaHeaders.RECEIVED_PARTITION_ID) int partition){

		subscribeKafkaInterface.runTopicBar(message,partition);
	}
}

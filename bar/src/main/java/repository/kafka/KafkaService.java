package repository.kafka;

import kafka.producter.ProducterService;
import kafka.topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
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

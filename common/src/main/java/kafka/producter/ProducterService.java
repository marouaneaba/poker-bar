package kafka.producter;


import kafka.topic.Topic;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.FailureCallback;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.SuccessCallback;

@Log4j2
@Service
public class ProducterService {

	@Autowired
	private KafkaTemplate<String,Object> kafkaTemplate;

	public void sendSynMessage(Topic topic, Object message){
		log.info("Start send stream in topic: "+topic.getName());
		ListenableFuture future = kafkaTemplate.send(topic.getName(),message);

		future.addCallback(
				success ->
						log.info("Stream is sending with success"),
				failure ->
						log.error("Failure to send stream in topic : "+topic.getName()));

	}

	public void sendAsynMessage(Topic topic, Object message, SuccessCallback successCallback, FailureCallback failureCallback){
		ListenableFuture future = kafkaTemplate.send(topic.getName(),message);
		future.addCallback(successCallback,failureCallback);
	}
}

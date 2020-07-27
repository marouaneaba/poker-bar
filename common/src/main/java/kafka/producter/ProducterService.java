package kafka.producter;


import kafka.topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.FailureCallback;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.SuccessCallback;

@Service
public class ProducterService {

	@Autowired
	private KafkaTemplate<String,Object> kafkaTemplate;

	public void sendSynMessage(Topic topic, Object message){ // TODO change sout to log info or error
		System.out.println("Start send stream in topic: "+topic.getName());
		ListenableFuture future = kafkaTemplate.send(topic.getName(),message);

		future.addCallback(
				success ->
						System.out.println("Stream is sending with success"),
				failure ->
						System.out.println("Failure to send stream in topic : "+topic.getName()));

	}

	public void sendAsynMessage(Topic topic, Object message, SuccessCallback successCallback, FailureCallback failureCallback){
		ListenableFuture future = kafkaTemplate.send(topic.getName(),message);
		future.addCallback(successCallback,failureCallback);
	}
}

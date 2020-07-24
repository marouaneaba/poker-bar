package kafka.consumer;

import java.util.HashMap;
import java.util.Map;
/*
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;*/


//@EnableKafka
//@Configuration
public class KafkaConsumerConfig {
/*
	@Value("${kafka.boostrapAddress}")
	private String boostrapAddress;

	@Bean
	public ConsumerFactory<String,Object> consumerFactory(){
		Map<String,Object> configs = new HashMap<>();
		configs.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,boostrapAddress);
		configs.put(ConsumerConfig.GROUP_ID_CONFIG, "");
		configs.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		configs.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,StringSerializer.class);

		return new DefaultKafkaConsumerFactory<>(configs,
				new StringDeserializer(),
				new JsonDeserializer<>(Object.class));
	}

	@Bean
	public ConcurrentKafkaListenerContainerFactory<String,Object> kafkaListenerContainerFactory() {

			ConcurrentKafkaListenerContainerFactory<String, Object> factory =
					new ConcurrentKafkaListenerContainerFactory<>();
			factory.setConsumerFactory(consumerFactory());
			return factory;
	}*/
}

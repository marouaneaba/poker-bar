package com.common.kafka.topic;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.admin.AdminClientConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaAdmin;


@Configuration
public class KafkaTopicConfig {

	@Value("kafka.boostrap-kafka-server.ip")
	private String kafkaBoostrapServerIp;

	@Value("kafka.boostrap-kafka-server.port")
	private String kafkaBoostrapServerPort;

	@Bean
	public KafkaAdmin kafkaAdmin(){
		Map<String,Object> configs = new HashMap<>();
		configs.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, String.format("%s:%s",kafkaBoostrapServerIp,kafkaBoostrapServerPort));
		return new KafkaAdmin(configs);
	}

}

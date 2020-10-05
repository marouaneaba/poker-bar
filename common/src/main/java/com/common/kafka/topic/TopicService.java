package com.common.kafka.topic;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.stereotype.Service;

@Service
public class TopicService {


	public NewTopic createTopic(Topic topic){
		return new NewTopic(topic.getName(),topic.getNumPartitions(),topic.getReplicartionFactor());
	}
}

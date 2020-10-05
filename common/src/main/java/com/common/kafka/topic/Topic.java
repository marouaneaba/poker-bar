package com.common.kafka.topic;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 *
 * Topic imuuable value objet
 */
@Builder
@AllArgsConstructor
@Data
public final class Topic {

	private String name;
	private int numPartitions;
	private short replicartionFactor;

}

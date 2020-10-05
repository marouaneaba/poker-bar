package com.common.kafka.topic;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * Topic imuable value objet
 */
//TODO apply lombok
 * Topic imuuable value objet
 */
@Builder
@AllArgsConstructor
@Data
public final class Topic {

	private String name;
	private int numPartitions;
	private short replicartionFactor;

	public Topic(String name, int  numPartitions,  short replicartionFactor){
		this.name = name;
		this.numPartitions = numPartitions;
		this.replicartionFactor = replicartionFactor;
	}

	public String getName() {
		return name;
	}

	protected int getNumPartitions(){
		return numPartitions;
	}

	protected short getReplicartionFactor(){
		return replicartionFactor;
	}
}

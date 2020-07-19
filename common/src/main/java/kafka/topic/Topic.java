package kafka.topic;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

/**
 * Topic imuable value objet
 */
@Builder
@AllArgsConstructor
public final class Topic {

	private String name;
	private int numPartitions;
	private short replicartionFactor;

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

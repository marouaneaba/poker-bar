package kafka.topic;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

/**
 *
 * Topic imuuable value objet
 */
@Builder
@AllArgsConstructor
public final class Topic {

	private String name;
	private int numPartitions;
	private short replicartionFactor;

}

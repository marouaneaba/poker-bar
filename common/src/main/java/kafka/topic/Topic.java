package kafka.topic;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

/**
 * Topic immuable value objet
 */
@Builder
@AllArgsConstructor
@Getter
public final class Topic {

	private String name;
	private int numPartitions;
	private short replicartionFactor;
}

package kafka;

public final class KafkaConstant {

	// Constant or dynamique value.
	public static String KAFKA_ADRESSE = "127.0.0.1"; // TODO dynamique value
	public static String KAFKA_PORT = ""; // TODO dynamique value
	public static String BOOSTRAP_SERVERS_CONFIG = String.join(KafkaConstant.KAFKA_ADRESSE,KafkaConstant.KAFKA_PORT);

	private KafkaConstant(){}

}

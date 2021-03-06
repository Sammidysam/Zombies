package weapons;

public class Weapon {
	protected double to360(double degrees){
		if(degrees < 0){
			double difference = -180 - degrees;
			degrees = 180 + difference;
		}
		return degrees;
	}
	protected double toNegative(double degrees){
		if(degrees > 180){
			double difference = -180 + degrees;
			degrees = -180 + difference;
		}
		return degrees;
	}
}


public class Car {
	private double topSpeed;
	private double mpg;
	private boolean isOn;
	private double gasLeft;

	public Car() {
		topSpeed = 100;
		mpg = 20;
		isOn = false;
		gasLeft = 5;
	}

	public Car(double topSpeed, double mpg, boolean isOn, double gasLeft) {
		this.topSpeed = topSpeed;
		this.mpg = mpg;
		this.isOn = isOn;
		this.gasLeft = gasLeft;
	}

	public void turnOn() {
		isOn = true;
	}

	public void fillGas(double amt) {
		gasLeft += amt;
	}

}

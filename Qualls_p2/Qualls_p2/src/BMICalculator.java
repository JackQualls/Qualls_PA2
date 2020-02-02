import java.util.Scanner;

public class BMICalculator {
	int height;
	int weight;
	int isMetric;
	Scanner input = new Scanner(System.in);
	public int getHeight() {
		return height;
	}

	private void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	private void setWeight(int weight) {
		this.weight = weight;
	}

	public void readUserData() {
		readUnitType();
		readMeasurementData();

	}

	public void readUnitType() {
		System.out.println("Are you using metric (0) or imperial units (1)?");
		isMetric = input.nextInt();

	}

	private void readMetricData() {
		System.out.println("Enter your height in cm's:");
		setHeight(input.nextInt());
		System.out.println("Enter your weight in kg's:");
		setWeight(input.nextInt());
	}

	private void readImperialData() {
		System.out.println("Enter your height in inches:");
		setHeight(input.nextInt());
		System.out.println("Enter your weight in pounds:");
		setWeight(input.nextInt());
	}

	private void readMeasurementData() {
		if (isMetric == 0) {
			readMetricData();
		} else {
			readImperialData();
		}
	}

	public void calculateBMI() {

	}

	private void calculateBMICategory() {

	}

	public void displayBMI() {

	}
}

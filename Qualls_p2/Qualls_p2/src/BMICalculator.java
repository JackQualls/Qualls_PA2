import java.util.Scanner;

public class BMICalculator {
	double height;
	double weight;
	int isMetric;
	double bmi;
	String category;
	Scanner input = new Scanner(System.in);
	public double getHeight() {
		return height;
	}

	private void setHeight(int height) {
		this.height = height;
	}

	public double getWeight() {
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
		if(height<0) {
			System.exit(1);
		}
		System.out.println("Enter your weight in kg's:");
		setWeight(input.nextInt());
		if(weight<0) {
			System.exit(1);
		}
	}

	private void readImperialData() {
		System.out.println("Enter your height in inches:");
		setHeight(input.nextInt());
		if(height<0) {
			System.exit(1);
		}
		System.out.println("Enter your weight in pounds:");
		setWeight(input.nextInt());
		if(weight<0) {
			System.exit(1);
		}
	}

	private void readMeasurementData() {
		if (isMetric == 0) {
			readMetricData();
		} else {
			readImperialData();
		}
	}
	
	public void getBmi() {
		calculateBmi();
	}
	
	public void getBmiCategory() {
		calculateBmiCategory();
	}
	
	public void calculateBmi() {
		if (isMetric == 0) {
			bmi=weight/((height/100)*(height/100));
		}
		else {
			bmi=(703*weight)/(height*height);
		}
		
	}


	private void calculateBmiCategory() {
		if(bmi<18.5) {
			category = "Underweight";
		}
		else if(bmi<25) {
			category = "Normal";
		}
		else if(bmi<30) {
			category = "Overweight";
		}
		else { category = "Obesity"; }
		
	}

	public void displayBmi() {
		calculateBmi();
		calculateBmiCategory();
		System.out.printf("BMI and BMI Category:%f\t%s", bmi, category);
		
	}
}

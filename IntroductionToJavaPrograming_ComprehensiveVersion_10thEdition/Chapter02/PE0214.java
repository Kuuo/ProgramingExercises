import java.util.*;

class PE0214 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter weight in pounds: ");
		double weight = input.nextDouble() * 0.45359237;

		System.out.print("Enter height in inches: ");
		double height = input.nextDouble() * 0.0254;

		System.out.println("BMI is " + (weight / (height * height)));
	}
}
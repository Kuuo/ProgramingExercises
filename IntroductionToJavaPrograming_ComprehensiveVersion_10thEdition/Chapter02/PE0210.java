import java.util.*;
class PE0210 {
	public static void main(String[] args) {
		System.out.print("Enter the amount of water in kilograms: ");

		Scanner input = new Scanner(System.in);
		double mass = input.nextDouble();

		System.out.print("Enter the initial temperature: ");
		double initialTemperature = input.nextDouble();

		System.out.print("Enter the finalTemperature: ");
		double finalTemperature = input.nextDouble();

		double energe = mass * (finalTemperature - initialTemperature) * 4184;

		System.out.println("The energe needed is " + energe);
	}
}
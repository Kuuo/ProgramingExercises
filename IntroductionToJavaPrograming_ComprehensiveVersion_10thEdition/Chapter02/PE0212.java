import java.util.*;
class PE0212 {
	public static void main(String[] args) {
		System.out.print("Enter the speed and accelaration: ");

		Scanner input = new Scanner(System.in);
		double speed = input.nextDouble();
		double accelaration = input.nextDouble();

		double length = (speed * speed) / (2 * accelaration);

		System.out.println("The minimum runway for this airplane is: " + length);
	}
}

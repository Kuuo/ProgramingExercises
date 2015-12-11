import java.util.*;
class PE0201 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a degree in celsius: ");
		double celsius = input.nextDouble();

		double fahrenheit = (9.0 / 5) * celsius + 32;

		System.out.println(celsius + "Celsius is " + fahrenheit + "Fahrenheit.");
	}
}
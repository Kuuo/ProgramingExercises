import java.util.*;
class PE0206 {
	public static void main(String[] args) {
		System.out.print("Enter a number between 0 and 1000: ");

		Scanner input = new Scanner(System.in);
		int number = input.nextInt();

		int sum = number % 10 + number / 10 % 10 + number / 100;

		System.out.println("The sum of the digits is " + sum);
	}
}
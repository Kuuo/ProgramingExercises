import java.util.*;
class PE0205 {
	public static void main(String[] args) {
		System.out.print("Enter the subtotal and a gratuity rate: ");

		Scanner input = new Scanner(System.in);

		double subtotal = input.nextDouble();
		double gratuity = input.nextDouble();

		double total = subtotal * (1 + gratuity / 100);

		System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
	}
}
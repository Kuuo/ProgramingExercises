import java.util.*;
class PE0203 {
	public static void main(String[] args) {
		System.out.print("Enter a value for feet: ");

		Scanner input = new Scanner(System.in);
		double feet = input.nextDouble();

		double meters = feet * 0.305;

		System.out.println(feet + " is " + meters + " meters.");
	}
}
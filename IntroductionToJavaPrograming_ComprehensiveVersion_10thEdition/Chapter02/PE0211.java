import java.util.*;
class PE0211 {
	public static void main(String[] args) {
		double population = 312032486;
		double secondsOf1Year = 365 * 24 * 3600;

		System.out.print("Enter the number of years: ");
		Scanner input = new Scanner(System.in);
		int years = input.nextInt();

		double numOf5thYearBirth = (secondsOf1Year * years) / 7.0;
		double numOf5thYearDeath = (secondsOf1Year * years) / 13.0;
		double numOf5thYearImmigrant = (secondsOf1Year * years) / 45.0;
		System.out.println("After " + years + " years, population is: " +
			(population + numOf5thYearBirth - numOf5thYearDeath - numOf5thYearImmigrant));
	}
}
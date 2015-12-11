import java.util.*;
class PE0213 {
	public static void main(String[] args) {
		System.out.print("Enter the monthly saving amount: ");

		Scanner input = new Scanner(System.in);
		double saveAmount = input.nextDouble();

		double after1MonthValue = saveAmount * 1.00417;
		double after2MonthValue = (saveAmount + after1MonthValue) * 1.00417;
		double after3MonthValue = (saveAmount + after2MonthValue) * 1.00417;
		double after4MonthValue = (saveAmount + after3MonthValue) * 1.00417;
		double after5MonthValue = (saveAmount + after4MonthValue) * 1.00417;
		double after6MonthValue = (saveAmount + after5MonthValue) * 1.00417;

		System.out.println("After the 6th month, the account value is $" + after6MonthValue);
	}
}
import java.util.*;
class PE0207 {
	public static void main(String[] args) {
		System.out.print("Enter the number of minutes: ");

		Scanner input = new Scanner(System.in);
		int minutes = input.nextInt();

		int minutesOf1Day = 24 * 60;
		int minutesOf1Year = 365 * minutesOf1Day;

		int years = minutes / minutesOf1Year;
		int remainMinutes = minutes % minutesOf1Year;

		int days = remainMinutes / minutesOf1Day;

		System.out.println(minutes + " minutes is approximately " 
			+ years + " years and " + days + " days.");	
	}
}
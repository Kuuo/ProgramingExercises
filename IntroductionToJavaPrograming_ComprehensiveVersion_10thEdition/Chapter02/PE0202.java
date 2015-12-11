import java.util.*;
class PE0202 {
	public static void main(String[] args) {
		System.out.print("Enter the radius and length of a cylinder: ");

		Scanner input = new Scanner(System.in);
		double radius = input.nextDouble();
		double length = input.nextDouble();

		double area = radius * radius * Math.PI;
		double length = area * length;

		System.out.println("The area is: " + area);
		System.out.println("The volumn is: " + volumn);
	}
}
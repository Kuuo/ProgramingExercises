import java.util.*;
class PE1206 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a hex number: ");
		String hex = input.nextLine();
		try {
			System.out.println("The decimal value for hex number is: " + hex2Decimal(hex.toUpperCase()));
		} catch(NumberFormatException ex) {
			System.out.println(ex);
		}
	}	

	public static int hex2Decimal(String hex){
		int decimalValue = 0;

		for (int i=0; i<hex.length(); i++) {
			char hexChar = hex.charAt(i);
			decimalValue = decimalValue * 16 + hexChar2Decimal(hexChar);
		}

		return decimalValue;
	}

	public static int hexChar2Decimal(char ch) throws NumberFormatException{
		if (ch >= 'A' && ch <= 'F') {
			return 10 + ch - 'A';
		} else if (ch >= '0' && ch <= '9') {
			return ch - '0';
		} else {
			throw new NumberFormatException("Illegal number format.\n");
		}
	}
}
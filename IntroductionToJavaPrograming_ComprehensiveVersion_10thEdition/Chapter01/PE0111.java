class PE0111 {
	public static void main(String[] args) {
		double population = 312032486;
		double secondsOf1Year = 365 * 24 * 3600;

		double numOf1stYearBirth = secondsOf1Year / 7;
		double numOf1stYearDeath = secondsOf1Year / 13;
		double numOf1stYearImmigrant = secondsOf1Year / 45;
		System.out.println("After 1 year , population is: " +
			(population + numOf1stYearBirth - numOf1stYearDeath - numOf1stYearImmigrant));

		double numOf2ndYearBirth = (secondsOf1Year * 2) / 7;
		double numOf2ndYearDeath = (secondsOf1Year * 2) / 13;
		double numOf2ndYearImmigrant = (secondsOf1Year * 2) / 45;
		System.out.println("After 2 years, population is: " +
			(population + numOf2ndYearBirth - numOf2ndYearDeath - numOf2ndYearImmigrant));

		double numOf3rdYearBirth = (secondsOf1Year * 3) / 7;
		double numOf3rdYearDeath = (secondsOf1Year * 3) / 13;
		double numOf3rdYearImmigrant = (secondsOf1Year * 3) / 45;
		System.out.println("After 3 years, population is: " +
			(population + numOf3rdYearBirth - numOf3rdYearDeath - numOf3rdYearImmigrant));

		double numOf4thYearBirth = (secondsOf1Year * 4) / 7;
		double numOf4thYearDeath = (secondsOf1Year * 4) / 13;
		double numOf4thYearImmigrant = (secondsOf1Year * 4) / 45;
		System.out.println("After 4 years, population is: " +
			(population + numOf4thYearBirth - numOf4thYearDeath - numOf4thYearImmigrant));

		double numOf5thYearBirth = (secondsOf1Year * 5) / 7;
		double numOf5thYearDeath = (secondsOf1Year * 5) / 13;
		double numOf5thYearImmigrant = (secondsOf1Year * 5) / 45;
		System.out.println("After 5 years, population is: " +
			(population + numOf5thYearBirth - numOf5thYearDeath - numOf5thYearImmigrant));
	}
}
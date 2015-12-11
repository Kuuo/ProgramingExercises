class PE0112 {
	public static void main(String[] args) {
		double meters = 24 * 1.6;
		double time = 1 + 40 / 60.0 + 35 / 3600.0;

		System.out.println("Average speed in kilometers per hour is: " + (meters / time) );
	}
}
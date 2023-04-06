class testError2
{
	public static void main (String[] args) {
		int a = 0;
		int b = 0;
		java.util.Random rand = new java.util.Random();
		for (int i = 0; i < 5; i++) {
			try {
				b = rand.nextInt(5);
				System.out.println ("b = " + b);
				a = 100/b;
			} catch (ArithmeticException e) {
				System.out.println ("Division by zero " + e);
				a = 0;
			}
			System.out.println ("a = " + a);
		}
		System.out.println ("After Error Handling");
	}
}
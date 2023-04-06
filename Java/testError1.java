class testError1
{
	public static void main (String s[]) {
		int d, a;
		d = 0;
		try {
			a = 42/d;
			System.out.println ("a = " + a);
		} catch (ArithmeticException ae) 
		{
			System.out.println ("Division by zero");
		}
		System.out.println ("After catch statement");
	}
}
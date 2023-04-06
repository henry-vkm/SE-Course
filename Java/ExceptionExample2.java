import java.util.*;

public class ExceptionExample2
{
	static Scanner s = new Scanner(System.in);
	public static void main (String[] args) {
		int dividend, divisor, quotient;
		try {
			System.out.println ("Enter the dividend: ");
			dividend = s.nextInt();
			System.out.println ("Enter the divisor: ");
			divisor = s.nextInt();
			System.out.println ();
			quotient = dividend / divisor;
			System.out.println ("Line 15: Quotient = " + quotient);
		} catch (ArithmeticException ae) {
			System.out.println ("Line 17: Exception " + ae.toString());
		} catch (InputMismatchException ime) {
			System.out.println ("Line 19: Exception " + ime.toString()); 
		}
	}
}
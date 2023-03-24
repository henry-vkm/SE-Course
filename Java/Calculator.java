import java.util.Scanner;

class Calculator 
{
	public static void main (String[] args) 
	{
		int a = getData();
		int b = getData();
		int answer = sum(a, b);
		System.out.println ("Sum = " + answer);
		sub(a, b);
		average(answer);
	}
	
	public static int getData () 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println ("Enter Number: ");
		return scan.nextInt();
	}
	
	public static int sum (int x, int y) 
	{
		return x + y;
	}
	
	public static void sub (int x, int y) 
	{
		System.out.println ("Subtraction = " + (x - y));
	}
	
	public static void average (int s) {
		System.out.println ("Average = " + s/2);
	}
}
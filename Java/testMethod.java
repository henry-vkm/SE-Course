import java.util.Scanner;

class testMethod 
{
	public static void main (String[] args)
	{
		Largest();
	}
	
	public static void Largest() 
	{
		int first, second, third;
		Scanner scan = new Scanner(System.in);
		System.out.println ("Enter three number value");
		first = scan.nextInt();
		second = scan.nextInt();
		third = scan.nextInt();
		if (first>second && first>third) System.out.println (first + " is the largest number.");
		else if (second>first && second>third) System.out.println (second + " is the largest number.");
		else System.out.println (third + " is the largest number.");
	}
}
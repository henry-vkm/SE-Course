import java.util.Scanner;

class ch3Assign5 
{
	public static void main (String[] args) 
	{
		int a, b, c;
		Scanner scan = new Scanner(System.in);
		System.out.println ("Enter three numbers: ");
		a = scan.nextInt();
		b = scan.nextInt(); 
		c = scan.nextInt();
		
		if (a > b && b > c) System.out.println (a + " > " + b + " > " + c);
		else if (a > c && c > b) System.out.println (a + " > " + c + " > " + b);
		else if (b > a && a > c) System.out.println (b + " > " + a + " > " + c);
		else if (b > c && a > c) System.out.println (b + " > " + c + " > " + a);
		else if (c > a && a > b) System.out.println (c + " > " + a + " > " + b);
		else System.out.println (c + " > " + b + " > " + a);
	}
}
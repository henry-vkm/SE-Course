import java.util.Scanner;

class sum 
{
	public static void main (String[] args) 
	{
 		Scanner scan = new Scanner(System.in);
 		int a = scan.nextInt();
 		int b = scan.nextInt();
 		
 		System.out.println (sum(a, b));
	}
	
	public static int  sum(int x, int y) 
	{
		return x + y;
	}
}

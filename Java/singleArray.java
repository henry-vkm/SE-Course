import java.util.Scanner;

class sigleArray 
{
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int[] a = new int[5];
		for (int i=0; i<5; i++) {
			System.out.println ("Enter a number: ");
			a[i] = scan.nextInt();
		}
		
		for (int i=0; i<5; i++) {
			System.out.println (a[i]);
		}
		int min = a[0];
		int max = a[0];
		System.out.println ("WORK");
		
		for (int i=1; i<5; i++) {
			if (min > a[i]) min = a[i];
			if (max < a[i]) max = a[i];
		}
		
		System.out.println ("Maximum = " + max + "\nMinimum = " + min);
	}
}
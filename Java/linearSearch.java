import java.util.Scanner;

class linearSearch 
{
	public static void main (String[] args) 
	{
		int[] a = new int[5];
		Scanner scan = new Scanner(System.in);
		for (int i=0; i<5; i++) {
			System.out.println ("Enter a number: ");
			a[i] = scan.nextInt();
		}
		
		int search;
		boolean found = false;
		System.out.println ("Enter number to search: ");
		search = scan.nextInt();
		
		for (int i=0; i<5; i++) {
			if (search == a[i]) {
				found=true;
				System.out.println (search + " found at " + i);
				break;
			}
		}
		if (!found) {
			System.out.println ("Search data is not found");
		}
	}
}
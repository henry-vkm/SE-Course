import java.util.Arrays;
import java.util.Scanner;

class ch7Assign2 
{
	public static void main (String[] args) 
	{
		int[] A = {70, 35, 100, 40, 80, 90, 50, 70, 45, 28};
		Arrays.sort(A);
		display(A);
		int sum = sum(A);
		System.out.println ("Sum of Array = " + sum);
		Average(A, sum);
		Search(A);
	
	}
	
	// Print function
	public static void display(int[] A)
	{
		for (int i=0; i<A.length; i++) 
		{
			System.out.println ("A[" + i + "]=" + A[i]);
		}
	}
	
	// sum function
	public static int sum(int[] A) {
		int total = 0;
		for (int i=0; i<A.length; i++) {
			total += A[i];
		}
		
		return total;
	}
	
	// average function
	public static void Average(int[] A, int total) {
		System.out.println ("Average = " + total/A.length); 
	}
	
	public static void Search(int[] A) {
		// Search 
		int searchWord;
		Scanner scan = new Scanner(System.in);
		System.out.println ("Enter number to search: ");
		searchWord = scan.nextInt();
		int i = Arrays.binarySearch(A, searchWord);
		if ( i >= 0 ) System.out.println (searchWord + " found at position " + i);
		else System.out.println ("Keyword not found");
	}
}
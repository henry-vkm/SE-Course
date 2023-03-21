import java.util.Scanner;
class ch3Assign1 
{
	public static void main (String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println ("Enter a number: ");
		num = scan.nextInt();
		if (num < 0) {
			System.out.println ("Negative");
		} else if (num > 0) {
			System.out.println ("Positive");
		} else {
			System.out.println ("Zero");
		}
}
}
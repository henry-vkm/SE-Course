import java.util.Scanner;36

class twoArray
{
	public static void main (String[] args) 
	{
		int[][] a = new int[4][5];
		Scanner scan = new Scanner(System.in);
		for (int i=0; i<4; i++) {
			for (int j=0; j<5; j++) {
				a[i][j] = scan.nextInt();
			}
		}
		
		for (int i=0; i<4; i++) {
			for (int j=0; j<5; j++) {
				System.out.println (a[i][j] + "\t");
			}
			System.out.println ();
		}
	}
}
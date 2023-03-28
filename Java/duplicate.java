import java.util.Arrays;

class duplicate 
{
	public static void main (String[] args) 
	{
		int[] a = {22, 14, 6, 8, 44, 20};
		System.out.print ("Array a=");
		print(a);
			
		int[] b = (int[]) a.clone();
		System.out.print ("Cloned array b = ");
		print(b);
		
		System.out.println ("Arrays.equals(a, b)=" + Arrays.equals(a,b));
		
		int i = Arrays.binarySearch(a, 44);
		System.out.println ("Found at position " + i);
		
		Arrays.sort(a);
		System.out.println ("Sorted Array a[] = ");
		print(a);
		
		String[] c = {"AB", "CD", "EF"};
		print(c);
		
		String[] d = (String[]) c.clone();
		print(d);
		
		c[1] = "XYZ"; 
		print(c);
		
		int[] ch = new int[20];
		Arrays.fill(ch, 1);
		print(ch);	
	}
	
	public static void print(int[] a) 
	{
		for (int i = 0; i< a.length; i++) System.out.print(a[i] + " ");
		System.out.println ();
	}
		
	public static void print(String[] a) 
	{
		for (int i = 0; i< a.length; i++) System.out.print(a[i] + " ");
		System.out.println ();
	}
}                                                                          
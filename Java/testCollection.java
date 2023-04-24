import java.util.*;
public class testCollection 
{
	public static void main (String args[]) 
	{
		ArrayList al = new ArrayList();
		al.add("Johnson");
		al.add("Mike");
		al.add("Susan");
		al.add("Rose");
		al.add(1, "Jack");
		System.out.println ("Size of al is " + al.size());
		System.out.println ("Contents of al are " + al);
		System.out.println ("Position 3 at " + al.get(3));
		al.set(4, "Michael");
		al.remove(2);
		System.out.println ("Size of al is " + al.size());
		System.out.println ("Contents of al are " + al);
	}
}
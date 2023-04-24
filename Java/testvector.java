import java.util.*;

public class testvector 
{
	public static void main(String s[])
	{
		Vector v = new Vector();
		v.addElement("Lisa");
		v.addElement("Jackson");
		v.addElement("Zachary");
		v.addElement("Mark");
		v.insertElementAt("Ron", 3);
		System.out.println ("size of v is " + v.size());
		System.out.println ("content of v are " + v);
		
		String str = "Jackson";
			int index = v.indexOf(str);
			System.out.println (str + " is at index " + index);
			v.setElementAt("Julia", 2);
			v.removeElement("Mark");
			System.out.println ("size of v is now " + v.size());
			System.out.println ("the capacity of v is now " + v.capacity());
			System.out.println ("content of v are now " + v);
	}
}
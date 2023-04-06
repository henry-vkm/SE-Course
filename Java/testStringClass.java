class testStringClass
{
	public static void main (String[] args)
	{
		int space;
		String msg = "Java Programming Language";
		space = msg.indexOf(' ');
		String first = msg.substring(0, space);
		System.out.println ("The first word is "+ first.toUpperCase());
		space = msg.lastIndexOf(' ');
		String last = msg.substring(space + 1);
		System.out.println ("The last word is " + last.toLowerCase());
		System.out.println (msg + " length=" + msg.length());
		System.out.println (first.concat(" Programmer"));
	}
}
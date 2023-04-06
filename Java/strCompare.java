class strCompare 
{
	public static void main (String[] args) {
		String msg1 = "Java"; 
		String msg2 = "JAVA";
		String msg3 = "java ".trim();
		
		if (msg1.equals(msg2))
			System.out.println ("This objects are equal.");
		else 
			System.out.println ("This objects are not equals.");
			
		if (msg1.equalsIgnoreCase(msg2))
			System.out.println ("This objects are equals ignore case.");
		else 
			System.out.println ("This objects are not equals ignore case.");
			
		msg1 = msg1.replace('a', 'o');
		System.out.println (msg1); 
	}
}
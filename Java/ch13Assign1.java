class ch13Assign1
{
	public static void main (String[] args) {
		char ch = 'a';
		System.out.println (ch + " Upper Case letter is " + Character.toUpperCase(ch));
		if (Character.isDigit(ch))
			System.out.println ("This is digit.");
		if (Character.isLetter(ch))
			System.out.println ("This character is letter.");
		if (Character.isJavaLetter(ch) == false) 
			System.out.println ("This is not a Java letter.");
	}
}
class testReverse 
{
	public static String testReverse (String source) 
	{
		int len = source.length();
		StringBuffer sb = new StringBuffer(len);
		for (int i = len-1; i>=0; i--) 
			sb.append(source.charAt(i));
		return sb.toString();
	}
	
	public static void main (String args[]) {
		String message = "Welcome to Java Program";
		System.out.println (testReverse(message));
	}
}
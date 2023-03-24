class hello 
{
	static int i;
	public static void main (String[] args) 
	{
		for (i=1; i<=5; i++) {
			System.out.println ("Input " + i);
		}
		sum();
	}
	
	public static void sum() {
		for (i=1; i<=3; i++) {
			System.out.println ("Hello " + i);
		}
	}
}
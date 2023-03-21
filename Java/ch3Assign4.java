public class ch3Assign4
{
	public static void main (String[] args) throws Exception
	{
		System.out.println("Y/N: ");
		char input = (char)System.in.read();
		switch(input)
		{
			case 'Y':
			case 'y': 
				System.out.println ("Yes");
				break;
			
			case 'N':
			case 'n':
				System.out.println ("No");
				break;
			
			default:
				System.out.println ("Unknown Response");
		}
	}
}
class ch4ex5dowhile
{
	public static void main (String[] args) 
		{
			int num = 6, fact = 1, i = num;
			do
			{
				fact = fact * i;
				i--;
			}
			while (i>=1);
			System.out.println (fact);
			
		}
}
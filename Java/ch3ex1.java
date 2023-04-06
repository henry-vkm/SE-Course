class ch3ex1
{
	public static void main (String[] args) 
	{
		int myanmar = 80, english = 80, maths = 80;
		if (myanmar >=80 && english >=80 && maths>=80)
		{
			System.out.println ("Distinction");
		}
		else if (myanmar >=65 && english >=65 && maths >=65)
		{
			System.out.println ("Pass with credit");
		}
		else if (myanmar >=40 && english >=40 && maths >=40)
		{
			System.out.println ("Pass");
		}
		else (myanmar <=40 && english <=40 && maths <=40)
			{
			System.out.println ("Fail");
		}
	}
}
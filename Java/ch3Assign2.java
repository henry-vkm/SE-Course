class ch3Assign2 
{
	public static void main (String[] args) 
	{
		int ticket;
		int speed = (int)Math.round(100*Math.random());
		System.out.println ("Speed = " + speed);
	  	ticket = speed > 55 ? 1 : 0;
	  	System.out.println ("No of tickets = " + ticket);
	}
}
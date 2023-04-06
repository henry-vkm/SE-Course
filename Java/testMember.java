public class testMember 
{
	public static void main (String[] args) {
		new Square(3).go();
	}
}

class Square
{
	double width, height;
		
	public Square(double w)
	{
		width = height = w;
	}
		
	public void go ()
	{
		Box b = new Box(2);
		System.out.println ("Volume is " + b.getVolume());
	}
		
	class Box 
	{
		double depth;
			
		public Box(double d)
		{
			depth = d;
		}
			
		public double getVolume()
		{
			return width * height * depth;
		}
	}
}
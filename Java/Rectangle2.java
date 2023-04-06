package Pack;
public class Rectangle2 
{
	public int width, height;
	public Rectangle2(int w, int h) 
	{
		width = w;
		height = h;
	}
	
	public void CalculateArea() {
		System.out.println ("Rectangle Area = " + width * height);
	}
}
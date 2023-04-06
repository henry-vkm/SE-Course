package Pack;
public class Triangle 
{
	public int base, height;
	
	public Triangle (int b, int h) 
	{
		base = b;
		height = h;
	}
	
	public String CalculateArea() 
	{
		return "Triangle Area = " + (0.5 * base * height);
	}
}
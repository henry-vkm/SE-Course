import Pack.Rectangle2;
import Pack.Triangle;
public class testPackage
{
	
	public static void main (String[] args) {
		Rectangle2 r = new Rectangle2(5, 10);
		r.CalculateArea();
		Triangle t = new Triangle(12, 7);
		System.out.println (t.CalculateArea());
	}
}
class ch8Assign2 
{
	public static void main (String[] args) {
		Square sq = new Square(8);
		sq.display();
		sq.enlarge(2);
		sq.display();
	}
}

class Square 
{
	int length;
	
	/*
	public Square() {
		length = 0;
	}
	*/
	
	public Square(int l) {
		length = l;
	}
	
	public void enlarge (int l) {
		length *= l;
	}
	
	public int area () {
		return length * length;
	}
	
	public void display() {
		System.out.println ("Length = " + length);
		System.out.println ("Area = " + area());
	}
}
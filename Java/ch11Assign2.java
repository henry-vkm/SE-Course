class Top 
{
	public Top() {
		System.out.print ("B");
	}
}

class Bottom2 extends Top {
	public Bottom2 (String s) {
		System.out.print ("D");
	}
	
	public static void main (String[] args) {
		new Bottom2("C");
		System.out.println ("");
	}
}
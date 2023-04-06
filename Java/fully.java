interface inter1 
{
	void show();
	void get();
}

class childClass implements inter1 
{
	public void show() {
		System.out.println ("Show method is invoked");
	}
	
	public void get() {
		System.out.println ("Get method is invoked");
	}
	
	public void set() {
		System.out.println ("Set method is invoked");
	}
}

class fully 
{
	public static void main (String[] args) {
		childClass obj1 = new childClass();
		System.out.println ("Output");
		obj1.show();
		obj1.get();
		obj1.set();
	}
}
import java.util.Scanner;

class testEncapsule 
{
	public static void main (String[] args) {
		Staff st = new Staff();
		st.setName();
		st.setAge();
		System.out.println ("Name = " + st.getName());
		System.out.println ("Age = " + st.getAge());
	}
}

class Staff 
{
	private String name;
	private int age;
	private Scanner scan = new Scanner(System.in);
	
	public void setName() {
		System.out.println ("Enter staff name: ");
		name = scan.nextLine();
	}
	
	public void setAge() {
		System.out.println ("Enter staff age: ");
		age = scan.nextInt();
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}
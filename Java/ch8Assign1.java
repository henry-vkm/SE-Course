class ch8Assign1 
{
	public static void main (String[] args) {
		Student st = new Student();
		st.display();
		
		Student st2 = new Student("Mya", "Bago", 70);
		st2.display();
	}	
}

class Student 
{
	String name;
	String address;
	int mark;
	public Student(){
		name = "Kyaw Gyi";
		address = "Yangon";
		mark = 90;
	}
	
	public Student (String n, String a, int m) {
		name = n;
		address = a;
		mark = m;
	}
	
	public void display () {
		System.out.println ("Name = " + name);
		System.out.println ("Address = " + address);
		System.out.println ("Mark = " + mark);
	}
}
class ch9Assign1 
{
	public static void main (String[] args) {
		Bank p1 = new Bank();
		p1.display();
		
		p1.increaseBalance(800);
		p1.display();
		
		p1.decreaseBalance(1000);
		p1.display();
		
		Bank p2 = new Bank("Helen", "67890", 80000.00);
		p2.display();
		
		p2.increaseBalance(800);
		p2.display();
		
		p2.decreaseBalance(1000);
		p2.display();
	}
}

class Bank 
{
	String accountName;
	String accountNumber;
	double balance;
	
	public Bank () {
		accountName = "John";
		accountNumber = "12345";
		balance = 1000.00;
	}
	
	public Bank(String name, String num, double blc) {
		accountName = name;
		accountNumber = num;
		balance = blc;
	}
	
	public void display() {
		System.out.println ("Account Name: " + accountName);
		System.out.println ("Account No.: " + accountNumber);
		System.out.println ("Account balance: " + balance);
	}
	
	public double increaseBalance (double amount) {
		return balance += amount;
	}
	
	public double decreaseBalance (double amount) {
		return balance -= amount;
	}
}
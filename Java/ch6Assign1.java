class averageSalaries 
{
	
	public static void main (String[] args) 
	{
		int[] salaries = new int[5];
		
		// add five random salaries to array
		for (int i = 0; i < 5; i++) {
			int salary = (int) Math.round(Math.random() * 3000);
			salaries[i] = salary;
			System.out.println (salaries[i]);
		}		

		System.out.println ("Average salaries = " + average(salaries));

	}
	
	// find average salary 
	public static int average (int[] salaries) 
	{
		int total = 0;
		for (int i = 0; i < salaries.length; i++) {
			total += salaries[i];
		}
		return total/salaries.length;
	}
}
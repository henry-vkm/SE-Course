class ch5Assign2 
{
	public static void main (String[] args) 
	{
		String[] name = {"Susan", "John", "Marry"};
		int[][] mark = {{70, 50, 100}, {85, 94, 75}, {74, 69, 98}};
		int total = 0;
		
		System.out.println ("Name\t\tModule1\t\tModule2\t\tModule3\t\tTotal");
		for (int i=0; i<name.length; i++) {
			System.out.print(name[i] + "\t\t");
			for (int j=0; j<3; j++) {
				System.out.print (mark[i][j] + "\t\t\t"); 
				total += mark[i][j];
			}
			System.out.println (total);
			total = 0;
		}
	}	
}

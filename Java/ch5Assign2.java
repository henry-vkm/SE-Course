class ch5Assign2 
{
	public static void main (String[] args) 
	{
		String[] name = {"Susan", "John", "Marry"};
		int[][] mark = {{70, 50, 100, 220}, {85, 94, 75, 254}, {74, 69, 98, 241}};
		
		System.out.println ("Name\t\tModule1\t\tModule2\t\tModule3\t\tTotal");
		for (int i=0; i<name.length; i++) {
			System.out.print(name[i] + "\t\t");
			for (int j=0; j<4; j++) {
				System.out.print (mark[i][j] + "\t\t\t");
			}
			System.out.println ();
		}
	}	
}

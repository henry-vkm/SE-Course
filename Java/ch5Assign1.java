class ch5Assign1 
{
	public static void main (String[] args)
	{
		int[] arr = new int[101];
		for (int i=0; i<101; i++) {
			arr[i] = i * i;
		}
		
		for (int i=0; i<101; i++) {
			System.out.println (i + " = " + arr[i]);
		}
	}
}
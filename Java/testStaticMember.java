public class testStaticMember 
{
	public static void main (String[] args) {
		/*
		Book b = new Book();
		System.out.println (b.getCategory());
		*/
		
		System.out.println (new Book().getCategory());
	}
	
	static class Book
	{
		public String getCategory() {
			return "This book is java programming.";
		}
	}
}
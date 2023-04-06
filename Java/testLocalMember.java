public class testLocalMember
{
	public static void main (String args[]) {
		class LocalClass 
		{
			public void getText() {
				System.out.println ("Inside Local Class.");
			}
		}
		new LocalClass().getText();
	}
}
interface Figure
{
	public void doSomething();
}

public class testAnonymous
{
	public static void main (String[] args) {
		Figure fig = new Figure(){
			public void doSomething() {
				System.out.println ("Anonymous Figure class Implementation");
			}
		};
		fig.doSomething();
	}
}
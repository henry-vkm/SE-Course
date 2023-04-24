import java.util.*;

public class testStack 
{
 	public static void main (String[] args) {
		Stack fruit = new Stack();
		fruit.push("Watermelon");
		fruit.push("Jack Fruit");
		fruit.push("Pineapple");
		
		String top = fruit.pop().toString();
		String newTop = fruit.peek().toString();
		String next = fruit.pop().toString();
		System.out.println (top + "\t" + newTop + "\t" + next);
	}
}
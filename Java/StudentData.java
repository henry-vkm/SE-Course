import java.io.*;
import java.util.StringTokenizer;

public class StudentData 
{
	public static String getString() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		return br.readLine().toString();
	}
	
	public static void main (String[] args) throws FileNotFoundException, IOException {
		writeData();
		readData();
	}
	
	public static void writeData() throws FileNotFoundException, IOException{
		BufferedWriter bw = new BufferedWriter(new FileWriter(("Student.txt"), true));
		String name;
		int mark;
		for (int i = 0; i < 5; i++) {
			System.out.print ("Enter Student Name: ");
			name = getString();
			System.out.print ("Enter Student Mark: ");
			mark = Integer.parseInt(getString());
			bw.write(name + "|" + mark + "\n");
		}
		bw.flush();
		bw.close();
	}
	
	public static void readData() throws FileNotFoundException, IOException {
		String line;
		System.out.println ("Name\tMark");
		BufferedReader br = new BufferedReader(new FileReader("Student.txt"));
		while((line = br.readLine()) != null) 
		{
			StringTokenizer stk = new StringTokenizer(line, "|");
			while (stk.hasMoreElements())
				System.out.println (stk.nextToken() + "\t");
			System.out.println ();
		}
	}
}
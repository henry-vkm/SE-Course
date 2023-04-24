import java.awt.*;
import javax.swing.*;

public class testFrame extends JFrame
{
	JLabel lblMessage;
	public testFrame() 
	{
		setTitle("Sample Frame");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		lblMessage = new JLabel("Hello Friend!", JLabel.CENTER);
		lblMessage.setFont(new Font("Calibri", Font.BOLD, 20));
		lblMessage.setForeground(Color.blue);
		add(lblMessage);
		setBounds(100, 100, 300, 150);
		setVisible(true);
	}
	
	public static void main(String args[])
	{
		new testFrame();
	}
}
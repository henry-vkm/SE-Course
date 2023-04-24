import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class testGridLayout extends JFrame implements ActionListener
{
	JButton btnMessage, btngetName, btnExit;
	public testGridLayout(String title) {
		super(title);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(3, 1));
		btnMessage = new JButton("Sample Message");
		btnMessage.addActionListener(this);
		btngetName = new JButton("Input Your Name");
		btngetName.addActionListener(this);
		btnExit = new JButton("Exit");
		btnExit.addActionListener(this);
		add(btnMessage);
		add(btngetName);
		add(btnExit);
		setBounds(100, 100, 300, 150);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource().equals(btnMessage)) {
			JOptionPane.showMessageDialog(null, "This is a sample message.");
		}
		
		if (ae.getSource().equals(btngetName)) {
			btngetName.setText(JOptionPane.showInputDialog(null, "Enter your name."));
		}
		
		if (ae.getSource().equals(btnExit)) {
			if (JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Exit Program", 
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==JOptionPane.YES_OPTION) 
				System.exit(0);
		}
	}
	
	public static void main (String[] args) {
		new testGridLayout("Using JOptionPane Dialog");
	}
}	
	
	
	
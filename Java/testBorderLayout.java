import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class testBorderLayout extends JFrame
{
	JMenuBar jmb = new JMenuBar();
	JMenu mnuFile = new JMenu("File");
	JMenu mnuHelp = new JMenu("Help");
	JMenuItem mnuOpen = new JMenuItem("Open");
	JMenuItem mnuExit = new JMenuItem("Exit");
	JMenuItem mnuAbout = new JMenuItem("About");
	JLabel lblName = new JLabel("Center");
	JLabel lblMessage = new JLabel("Section");
	JButton btnEast = new JButton("East");
	JButton btnWest = new JButton("West");
	JTextField txtDisplay = new JTextField("Ready");
	JPanel P = new JPanel();
	FileDialog fd = new FileDialog(this, "Open");
	
	public testBorderLayout() {
		super("Border Layout Frame");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		mnuFile.add(mnuOpen);
		
		mnuOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) 
			{
				fd.show();
				txtDisplay.setText("Selected File Name is " + fd.getFile());
			}
		});
		
		mnuFile.add(mnuExit);
		mnuExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				System.exit(0);
			}
		});
		
		mnuHelp.add(mnuAbout);
		mnuAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				JOptionPane.showMessageDialog(null, "This Frame is the Border Layout Sample");
			}
		});
		
		jmb.add(mnuFile);
		jmb.add(mnuHelp);
		getContentPane().add(jmb, BorderLayout.NORTH);
		P.setBackground(Color.white);
		P.add(lblName);
		P.add(lblMessage);
		getContentPane().add(P, BorderLayout.CENTER);
		getContentPane().add(btnEast, BorderLayout.EAST);
		getContentPane().add(btnWest, BorderLayout.WEST);
		txtDisplay.setEditable(false);
		getContentPane().add(txtDisplay, BorderLayout.SOUTH);
		setBounds(100, 100, 250, 150);
		setVisible(true);
	}
	
	public static void main (String[] args) {
		new testBorderLayout();
	}
	
}
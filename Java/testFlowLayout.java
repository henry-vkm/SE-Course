import javax.swing.*;
import java.awt.*;

public class testFlowLayout extends JFrame 
{
	JLabel lblName = new JLabel("Name");
	JTextField txtName = new JTextField(15);
	JButton btnOk = new JButton("Ok");
	
	public testFlowLayout() {
		super("Flowlayout Frame");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		add(lblName);
		add(txtName);
		add(btnOk);
		setBounds(100, 100, 250, 100);
		setVisible(true);
	}
	
	public static void main (String[] args) {
		new testFlowLayout();
	}
}
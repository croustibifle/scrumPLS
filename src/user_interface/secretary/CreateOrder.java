package user_interface.secretary;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CreateOrder extends JPanel{ 
	
	public CreateOrder(){

	    this.setLayout(new BorderLayout());
	    
	    JPanel buttonPanel = new JPanel();
	    JPanel mySecondPanel = new JPanel();
	    JButton myFirstButton = new JButton("Create");
	    JButton mySecondButton = new JButton("Cancel");
	    JLabel myLabel = new JLabel("Category : ");
	    JTextField myJTF = new JTextField();
	    
	    buttonPanel.setLayout(new GridLayout(1,2));
	    buttonPanel.add(myFirstButton);
	    buttonPanel.add(mySecondButton);
	    
	    mySecondPanel.add(myLabel);
	    mySecondPanel.add(myJTF);
	    
	    this.add(buttonPanel, BorderLayout.CENTER);
	    this.add(mySecondPanel, BorderLayout.NORTH);
	}
}

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
	    
	    JPanel myFirstPanel = new JPanel();
	    JPanel mySecondPanel = new JPanel();
	    JLabel myLabel = new JLabel("Category : ");
	    JTextField myJTF = new JTextField();
	    
	    myFirstPanel.setLayout(new GridLayout(1,2));
	    myFirstPanel.add(new JButton("Create"));
	    myFirstPanel.add(new JButton("Return"));
	    
	    mySecondPanel.add(myLabel);
	    mySecondPanel.add(myJTF);
	    
	    this.add(myFirstPanel, BorderLayout.CENTER);
	    this.add(mySecondPanel, BorderLayout.NORTH);
	}
}

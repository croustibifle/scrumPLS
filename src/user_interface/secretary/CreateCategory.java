package user_interface.secretary;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CreateCategory extends JPanel{ 
	
	public CreateCategory(){
	    this.setLayout(new BorderLayout());
	    
	    JLabel myLabel = new JLabel("Category : ");
	    JTextField myJTF = new JTextField();
	    
	    JPanel buttonPanel = new JPanel();
	    JPanel formPanel = new JPanel();
	    
	    buttonPanel.setLayout(new GridLayout(1,2));
	    buttonPanel.add(new JButton("Create"));
	    buttonPanel.add(new JButton("Cancel"));
	    
	    formPanel.add(myLabel);
	    formPanel.add(myJTF);
	    
	    this.add(buttonPanel, BorderLayout.CENTER);
	    this.add(formPanel, BorderLayout.NORTH);
	}
}
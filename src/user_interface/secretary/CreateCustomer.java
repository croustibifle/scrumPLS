package user_interface.secretary;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CreateCustomer extends JPanel{ 
	
	public CreateCustomer(){
	    this.setLayout(new BorderLayout());
	    
	    JPanel buttonPanel = new JPanel();
	    JPanel entryPanel = new JPanel();
	    JButton createButton = new JButton("Create");
	    JButton cancelButton = new JButton("Cancel");
	    JLabel categoryLabel = new JLabel("Category : ");
	    JTextField categoryTF = new JTextField();
	    
	    buttonPanel.setLayout(new GridLayout(1,2));
	    buttonPanel.add(createButton);
	    buttonPanel.add(cancelButton);
	    
	    entryPanel.add(categoryLabel);
	    entryPanel.add(categoryTF);
	    
	    this.add(buttonPanel, BorderLayout.CENTER);
	    this.add(entryPanel, BorderLayout.NORTH);
	}
}

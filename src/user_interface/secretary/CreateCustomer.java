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
	    
	    JLabel title = new JLabel("CUSTOMER CREATION",JLabel.CENTER);
	    
	    JPanel entryPanel = new JPanel();
	    JLabel clientLabel = new JLabel("Client : ");
	    JTextField clientTF = new JTextField();
	    JLabel cityLabel = new JLabel("City : ");
	    JTextField cityTF = new JTextField();
	    
	    entryPanel.setLayout(new GridLayout(2,2));
	    entryPanel.add(clientLabel);
	    entryPanel.add(clientTF);
	    entryPanel.add(cityLabel);
	    entryPanel.add(cityTF);
	    
	    JPanel buttonPanel = new JPanel();
	    JButton createButton = new JButton("Create");
	    JButton cancelButton = new JButton("Cancel");
	    
	    buttonPanel.setLayout(new GridLayout(1,2));
	    buttonPanel.add(createButton);
	    buttonPanel.add(cancelButton);
	    
	    this.add(title, BorderLayout.NORTH);
	    this.add(entryPanel, BorderLayout.CENTER);
	    this.add(buttonPanel, BorderLayout.SOUTH);
	}
}

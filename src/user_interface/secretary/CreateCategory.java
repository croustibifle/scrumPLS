package user_interface.secretary;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CreateCategory extends JPanel{ 
	
	public CreateCategory(){
		
	    this.setLayout(new BorderLayout());
	    
	    JLabel title = new JLabel("CATEGORY CREATION",JLabel.CENTER);
	    
	    JPanel entryPanel = new JPanel();
	    entryPanel.setLayout(new GridLayout(1,2));
	    JLabel categoryLabel = new JLabel("Category : ");
	    JTextField newCategory = new JTextField();
	    
	    entryPanel.add(categoryLabel);
	    entryPanel.add(newCategory);
	    
	    JPanel buttonPanel = new JPanel();
	    buttonPanel.setLayout(new GridLayout(1,2));
	    JButton createButton = new JButton("Create");
	    JButton cancelButton = new JButton("Cancel");
	    
	    buttonPanel.add(createButton);
	    buttonPanel.add(cancelButton);
	    
	    this.add(title, BorderLayout.NORTH);
	    this.add(buttonPanel, BorderLayout.SOUTH);
	    this.add(entryPanel, BorderLayout.CENTER);
	    this.setVisible(true);
	    
	    
	}
}

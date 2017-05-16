package user_interface.secretary;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CreateSpecie extends JPanel{ 
	
	public CreateSpecie(){
	    this.setLayout(new BorderLayout());
	    
	    JPanel buttonPanel = new JPanel();
	    JPanel entryPanel = new JPanel();
	    JButton createButton = new JButton("Create");
	    JButton cancelButton = new JButton("Cancel");
	    JLabel speciesLabel = new JLabel("Species : ");
	    JLabel categoryLabel = new JLabel("Category : ");
	    JTextField speciesTF = new JTextField();
	    JComboBox categoryCB = new JComboBox();

	    buttonPanel.setLayout(new GridLayout(1,2));
	    buttonPanel.add(createButton);
	    buttonPanel.add(cancelButton);
	    
	    entryPanel.add(speciesLabel);
	    entryPanel.add(speciesTF);
	    entryPanel.add(categoryLabel);
	    entryPanel.add(categoryCB);
	    
	    this.add(buttonPanel, BorderLayout.SOUTH);
	    this.add(entryPanel, BorderLayout.CENTER);
	}
}

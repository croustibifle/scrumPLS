package user_interface.secretary;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CreateSpecies extends JPanel{ 
	
	public CreateSpecies(){
	    this.setLayout(new BorderLayout());
	    
	    JLabel title = new JLabel("SPECIES CREATION",JLabel.CENTER);
	    
	    JPanel entryPanel = new JPanel();
	    JLabel speciesLabel = new JLabel("Species : ",JLabel.CENTER);
	    JLabel categoryLabel = new JLabel("Category : ",JLabel.CENTER);
	    JTextField speciesTF = new JTextField();
	    JComboBox categoryCB = new JComboBox();  
	    
	    entryPanel.setLayout(new GridLayout(2,2));
	    entryPanel.add(speciesLabel);
	    entryPanel.add(speciesTF);
	    entryPanel.add(categoryLabel);
	    entryPanel.add(categoryCB);

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

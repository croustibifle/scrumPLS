package user_interface.validator;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ScrapieTestMenu extends JPanel{
	public ScrapieTestMenu(){

	    this.setLayout(new BorderLayout());
	    
	    JLabel title = new JLabel("SCRAPIE TEST CREATION",JLabel.CENTER);
	    
	    JPanel entryPanel = new JPanel();
	    JLabel speciesLabel = new JLabel("Species : ",JLabel.CENTER);
	    JComboBox speciesCB = new JComboBox();
	    JLabel positionLabel = new JLabel("Position : ",JLabel.CENTER);
	    JTextField positionTF = new JTextField();	
	    JLabel valueLabel = new JLabel("Value : ",JLabel.CENTER);
	    JTextField valueTF = new JTextField();
	    
	    entryPanel.setLayout(new GridLayout(3,2));
	    entryPanel.add(speciesLabel);
	    entryPanel.add(speciesCB);
	    entryPanel.add(positionLabel);
	    entryPanel.add(positionTF);
	    entryPanel.add(valueLabel);
	    entryPanel.add(valueTF);
	    
	    JPanel buttonPanel = new JPanel();
	    JButton createButton = new JButton("Create");
	    JButton cancelButton = new JButton("Cancel");
	    
	    buttonPanel.setLayout(new GridLayout(1,2));
	    buttonPanel.add(createButton);
	    buttonPanel.add(cancelButton);
	    
	    this.add(title, BorderLayout.NORTH);
	    this.add(entryPanel, BorderLayout.CENTER);
	    this.add(buttonPanel, BorderLayout.SOUTH);	 
	    this.setVisible(true);
	}
}

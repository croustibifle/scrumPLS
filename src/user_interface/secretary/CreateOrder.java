package user_interface.secretary;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CreateOrder extends JPanel{ 
	
	public CreateOrder(){

	    this.setLayout(new BorderLayout());
	    
	    JLabel title = new JLabel("ORDER CREATION",JLabel.CENTER);
	    
	    JPanel entryPanel = new JPanel();
	    JLabel clientLabel = new JLabel("Client : ");
	    JComboBox clientCB = new JComboBox();
	    JButton addClientButton = new JButton("+");
	    JLabel categoryLabel = new JLabel("Category : ");
	    JComboBox categoryCB = new JComboBox();
	    JButton addCategoryButton = new JButton("+");
	    JLabel speciesLabel = new JLabel("Species : ");
	    JComboBox speciesCB = new JComboBox();
	    JButton addSpeciesButton = new JButton("+");
	    JLabel analysisLabel = new JLabel("Analysis : ");
	    JComboBox analysisCB = new JComboBox();
	    JLabel sampleLabel = new JLabel("Number of samples : ");
	    JTextField sampleTF = new JTextField();	
	    JLabel voidLabel = new JLabel();
	    
	    entryPanel.setLayout(new GridLayout(5,3));
	    entryPanel.add(clientLabel);
	    entryPanel.add(clientCB);
	    entryPanel.add(addClientButton);
	    entryPanel.add(categoryLabel);
	    entryPanel.add(categoryCB);
	    entryPanel.add(addCategoryButton);
	    entryPanel.add(speciesLabel);
	    entryPanel.add(speciesCB);
	    entryPanel.add(addSpeciesButton);
	    entryPanel.add(analysisLabel);
	    entryPanel.add(analysisCB);
	    entryPanel.add(voidLabel);
	    entryPanel.add(sampleLabel);
	    entryPanel.add(sampleTF);
	    
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

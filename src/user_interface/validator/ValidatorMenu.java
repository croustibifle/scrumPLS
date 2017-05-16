package user_interface.validator;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ValidatorMenu extends JPanel {
	public ValidatorMenu(){
		this.setLayout(new BorderLayout());
		
		JLabel title = new JLabel("VALIDATOR",JLabel.CENTER);
		
		JPanel buttonPanel = new JPanel();
	    JButton visualizeButton = new JButton("Visualize order");
	    JButton scrapieButton = new JButton("Create Scrapie test");
	    
	    buttonPanel.setLayout(new GridLayout(1,2));
	    buttonPanel.add(visualizeButton);
	    buttonPanel.add(scrapieButton);
	    
	    this.add(title, BorderLayout.NORTH);
	    this.add(buttonPanel, BorderLayout.CENTER);
	}
}

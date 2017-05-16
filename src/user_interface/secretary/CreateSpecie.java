package user_interface.secretary;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CreateSpecie extends JFrame{ 
	
	public CreateSpecie(){
		this.setTitle("Specie creation");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLayout(new BorderLayout());
	    
	    JPanel myFirstPanel = new JPanel();
	    JPanel mySecondPanel = new JPanel();
	    JLabel myFirstLabel = new JLabel("Specie : ");
	    JLabel mySecondLabel = new JLabel("Category : ");
	    JTextField myJTF = new JTextField();
	    JComboBox myComboBox = new JComboBox();

	    myFirstPanel.setLayout(new GridLayout(1,2));
	    myFirstPanel.add(new JButton("Create"));
	    myFirstPanel.add(new JButton("Return"));
	    
	    mySecondPanel.add(myFirstLabel);
	    mySecondPanel.add(myJTF);
	    mySecondPanel.add(mySecondLabel);
	    mySecondPanel.add(myComboBox);
	    
	    this.add(myFirstPanel, BorderLayout.SOUTH);
	    this.add(mySecondPanel, BorderLayout.CENTER);
	    this.setSize(700, 500);
	    this.setVisible(true);
	}
}

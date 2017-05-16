package user_interface.secretary;
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SecretaryMenu extends JFrame {

	public SecretaryMenu(){
	     this.setLayout(new BorderLayout());
	     
	     JPanel buttonPanel = new JPanel();
	     JButton orderButton = new JButton("Order");
	     JButton speciesButton = new JButton("Species");
	     JButton customerButton = new JButton("Customer");
	     JButton categoryButton = new JButton("Category");
	     
	     buttonPanel.setLayout(new GridLayout(2,2));
	
	     buttonPanel.add(orderButton);
	     buttonPanel.add(speciesButton);
	     buttonPanel.add(customerButton);
	     buttonPanel.add(categoryButton);
	
	     this.add(buttonPanel, BorderLayout.CENTER);
    }
}


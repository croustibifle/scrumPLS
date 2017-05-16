package user_interface.secretary;
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SecretaryMenu extends JFrame {

	public SecretaryMenu(){
	     this.setLayout(new BorderLayout());
	     
	     JPanel myPanel = new JPanel();
	     
	     myPanel.setLayout(new GridLayout(2,2));
	
	     myPanel.add(new JButton("Order"));
	     myPanel.add(new JButton("Species"));
	     myPanel.add(new JButton("Customer"));
	     myPanel.add(new JButton("Category"));
	
	     this.add(myPanel, BorderLayout.CENTER);
    }
}

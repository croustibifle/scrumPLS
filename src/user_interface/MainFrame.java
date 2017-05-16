package user_interface;
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import user_interface.secretary.CreateCategory;

public class MainFrame extends JFrame {
	
	private JPanel myPanel;
	
	public MainFrame(){
		 this.setTitle("Genindex application");
	     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     this.setLayout(new BorderLayout());
	     
	     myPanel = new CreateCategory();
	
	     this.add(myPanel, BorderLayout.CENTER);
	     this.setSize(700, 500);
	     this.setVisible(true);
	}

}

package user_interface;
import javax.swing.*;

import controllers.AppController;

public class MainFrame extends JFrame{
	
	
	public MainFrame(){
		
		this.setTitle("Genindex application");
		AppController c = new AppController(this);
		c.homePage();
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	    this.setSize(800, 600);
		this.setVisible(true);
	}

}

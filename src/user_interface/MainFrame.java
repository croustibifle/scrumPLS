package user_interface;
import javax.swing.*;

import controllers.AppController;
import core.Datas;

public class MainFrame extends JFrame{
	
	private AppController app;
	
	public MainFrame(AppController a){
		app = a;
		this.setTitle("Genindex application");
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	    this.setSize(800, 600);
		this.setVisible(true);
	}

}

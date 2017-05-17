package user_interface;
import javax.swing.*;

import controllers.HomeController;
import core.Datas;

public class MainFrame extends JFrame{
	
	private Datas datas;
	
	public MainFrame(Datas datas2){
		this.datas = datas2;
		
		this.setTitle("Genindex application");
		HomeController c = new HomeController();
		this.add(c.getView());
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	    this.setSize(800, 600);
		this.setVisible(true);
	}

}

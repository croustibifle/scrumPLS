import javax.swing.JFrame;

import user_interface.home.Home;
import user_interface.secretary.CreateCategory;
import user_interface.secretary.CreateSpecies;
import user_interface.validator.ExploreOrder;
import user_interface.validator.ValidatorMenu;

public class Main {

	public static void main(String[] args) {
		JFrame j = new JFrame();
		j.setTitle("Genindex application");
	    j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	    j.setSize(800, 600);
//		Home h = new Home();
//		CreateSpecies c = new CreateSpecies();
//		ValidatorMenu m = new ValidatorMenu();
//		CreateCategory g = new CreateCategory ();
		
		ExploreOrder o = new ExploreOrder();
		j.add(o);
		j.setVisible(true);
	}
}

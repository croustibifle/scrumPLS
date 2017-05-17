import javax.swing.JFrame;

import user_interface.validator.ValidatorMenu;

public class Main {

	public static void main(String[] args) {
		JFrame j = new JFrame();
		j.setTitle("Genindex application");
	    j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	    j.setSize(800, 600);
//		Home h = new Home();
//		CreateSpecies c = new CreateSpecies();
		ValidatorMenu m = new ValidatorMenu(j);
//	    CreateCategory g = new CreateCategory ();
//		ExploreOrder o = new ExploreOrder();
		j.add(m);
		j.setVisible(true);
	}
}

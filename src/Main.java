import javax.swing.JFrame;

import user_interface.MainFrame;
import user_interface.home.Home;
import user_interface.secretary.CreateSpecies;
import user_interface.validator.ValidatorMenu;

public class Main {

	public static void main(String[] args) {
		//new MainFrame();
		MainFrame j = new MainFrame();
		Home h = new Home();
		CreateSpecies c = new CreateSpecies();
		ValidatorMenu m = new ValidatorMenu();
		j.add(m);
		j.setVisible(true);
	}
}

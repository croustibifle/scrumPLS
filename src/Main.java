import javax.swing.JFrame;

import user_interface.MainFrame;
import user_interface.home.Home;
import user_interface.secretary.CreateSpecies;

public class Main {

	public static void main(String[] args) {
		//new MainFrame();
		MainFrame j = new MainFrame();
		Home h = new Home();
		CreateSpecies c = new CreateSpecies();
		j.add(h);
		j.setVisible(true);
	}
}

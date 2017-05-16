import javax.swing.JFrame;

import user_interface.secretary.CreateSpecies;

public class Main {

	public static void main(String[] args) {
		//new MainFrame();
		JFrame j = new JFrame();
		CreateSpecies c = new CreateSpecies();
		j.add(c);
		j.setVisible(true);
		
	}
}

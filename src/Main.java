import user_interface.MainFrame;
import user_interface.secretary.SecretaryMenu;
import user_interface.secretary.*;
import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		//new MainFrame();
		JFrame j = new JFrame();
		CreateOrder c = new CreateOrder();
		j.add(c);
		j.setVisible(true);
		
	}
}

import controllers.AppController;
import core.*;
import user_interface.MainFrame;

public class Main {

	public static void main(String[] args) {
		
		Datas d = new Datas();
		d.addUser("validator","validator", "validator");
		d.addUser("secretary","secretary", "secretary");
		
		new AppController(d);
	}
}

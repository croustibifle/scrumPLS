package controllers;
import core.User;
import user_interface.home.Home;

public class HomeController {

	private Home view;
	private AppController app;
	
	public HomeController(AppController a){
		app = a;
		view = new Home(this);
	}
	
	public void submitForm(){	
		User u = app.testCo(view.getLoginField(),view.getPasswordField());
		if (u != null && u.getType().equals("validator"))
			app.validatorMenu();
		else if (u != null && u.getType().equals("secretary"))
			app.secretaryMenu();
		else
			view.error();
	}

	public Home getView() {
		return view;
	}
	
}

package controllers;
import user_interface.home.Home;

public class HomeController {

	private Home view;
	
	public HomeController(){
		this.view = new Home(this);
	}
	
	public void submitForm(){	
	
	}

	public Home getView() {
		return view;
	}
	
}

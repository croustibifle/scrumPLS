package controllers;
import user_interface.home.Home;

public class HomeController {

	private Home view;
	
	public HomeController(){
		this.view = new Home(this);
	}
	
	public void submitFormulaire(){	
	
	}

	public Home getView() {
		return view;
	}
	
}

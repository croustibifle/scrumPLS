package controllers;

import user_interface.secretary.SecretaryMenu;

public class SecretaryMenuController {

	private SecretaryMenu view;
	private AppController app;
	
	public SecretaryMenuController(AppController a){
		app = a;
		view = new SecretaryMenu(this);
	}

	public void goCreateOrder() {
		app.createOrder();
	}

	public void goCreateCustomer() {
		app.createCustomer();
	}
	
	public void goCreateSpecies() {
		app.createSpecies();
	}

	public void goCreateCategory() {
		app.createCategory();
	}
	
	public SecretaryMenu getView() {
		return view;
	}
	
	public void goBack(){
		app.homePage();
	}
	
}

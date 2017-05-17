package controllers;

import user_interface.validator.ValidatorMenu;

public class ValidMenuController {

	private ValidatorMenu view;
	private AppController app;
	
	public ValidMenuController(AppController a){
		app = a;
		view = new ValidatorMenu(this);
	}
	
	public ValidatorMenu getView() {
		return view;
	}

	public void goScrapieTest() {
		app.scrapieTest();
	}

	public void goOrderVizualisation() {
		app.orderVizualisation();
	}
}

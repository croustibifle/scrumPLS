package controllers;
import java.awt.Component;

import user_interface.validator.ExploreOrder;

public class OrderVizuController {
	
	private ExploreOrder view;
	private AppController app;
	
	public OrderVizuController(AppController a){
		app = a;
		view = new ExploreOrder(this);
	}
	
	public void goBack(){
		app.validatorMenu();
	}

	public ExploreOrder getView() {
		return view;
	}

}

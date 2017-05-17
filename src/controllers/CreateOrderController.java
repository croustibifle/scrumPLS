package controllers;
import java.awt.Component;

import user_interface.secretary.CreateOrder;

public class CreateOrderController {

	private CreateOrder view;
	private AppController app;
	
	public CreateOrderController(AppController a) {
		app = a;
		view = new CreateOrder(this);
	}

	public void goBack() {
		app.secretaryMenu();
	}

	public CreateOrder getView() {
		return view;
	}

}

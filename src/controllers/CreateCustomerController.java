package controllers;

import java.awt.Component;

import user_interface.secretary.CreateCustomer;

public class CreateCustomerController {

	private CreateCustomer view;
	private AppController app;

	public CreateCustomerController(AppController a) {
		app = a;
		view = new CreateCustomer(this);
	}

	public CreateCustomer getView() {
		return view;
	}

	public void goBack() {
		app.secretaryMenu();
	}

}

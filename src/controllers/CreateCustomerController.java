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

	public void submitForm(String clientName, String city) {
		if (app.getDatas().getCustList().addCustomer(clientName, city)){
			app.secretaryMenu();
			view.validate();
		}
		else{
			view.error();
		}
	}

}

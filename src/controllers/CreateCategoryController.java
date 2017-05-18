package controllers;


import java.awt.Component;

import user_interface.secretary.CreateCategory;

public class CreateCategoryController {
	
	private CreateCategory view;
	private AppController app;

	public CreateCategoryController(AppController a) {
		app = a;
		view = new CreateCategory(this);
	}

	public CreateCategory getView() {
		return view;
	}

	public void goBack() {
		app.secretaryMenu();
	}

	public void submitForm(String categoryName) {
		if (app.getDatas().getCatList().addCategory(categoryName)){
			view.validate();
			app.secretaryMenu();
		}
			
		else{
			view.error();
		}
			
	}

}

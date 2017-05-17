package controllers;

import user_interface.secretary.CreateSpecies;

public class CreateSpeciesController {

	private CreateSpecies view;
	private AppController app;
	
	public CreateSpeciesController(AppController a) {
		app = a;
		view = new CreateSpecies(this);
	}
	
	public void goBack() {
		app.secretaryMenu();
	}

	public CreateSpecies getView() {
		return view;
	}

}

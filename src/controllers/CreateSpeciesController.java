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

	public void submitForm(String specieName, String catName) {
		if (app.getDatas().getCatList().addSpecie(specieName, catName)){
			app.secretaryMenu();
			view.validate();
		}
		else{
			view.error();
		}
	}
	
	public AppController getApp(){
		return app;
	}

}

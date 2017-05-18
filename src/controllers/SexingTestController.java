package controllers;

import core.SexingTest;
import core.Specie;
import core.SpecieCategory;
import user_interface.validator.SexingTestMenu;

public class SexingTestController {
	
	private SexingTestMenu view;
	private AppController app;
	
	public SexingTestController(AppController a){
		app = a;
		view = new SexingTestMenu(this);
	}
	
	public SexingTestMenu getView() {
		return view;
	}
	
	public void goBack(){
		app.validatorMenu();
	}

	public AppController getApp() {
		// TODO Auto-generated method stub
		return app;
	}

	public void submitForm(String name, int posF, int posM, int valF, int valM) {
	    for (SpecieCategory c: app.getDatas().getCatList().getListe()) {
	        for (Specie s : c.getSpecies()){
	        	if (s.getName().equals(name)){
	        		new SexingTest(s, posM, valM, posF, valF);
	        		view.validate();
	        		app.validatorMenu();
	        		break;
	        	}
	        }
	    }
	}

	public void submitPosVal(int posF, int posM, int valF, int valM) {
		if (posF <= 0 || valF <= 0 || posM <= 0 || valM <= 0)
			view.error();
	}

}

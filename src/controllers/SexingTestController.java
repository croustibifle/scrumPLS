package controllers;

import core.ScrapieTest;
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

	public void submitForm(String name, int pos, int val) {
	    for (SpecieCategory c: app.getDatas().getCatList().getListe()) {
	        for (Specie s : c.getSpecies()){
	        	if (s.getName().equals(name)){
	        		new ScrapieTest(s,pos,val);
	        		view.validate();
	        		app.validatorMenu();
	        		break;
	        	}
	        }
	    }
	}

}

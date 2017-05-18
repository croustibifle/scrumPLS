package controllers;

import core.Customer;
import core.Order;
import core.ScrapieTest;
import core.Specie;
import core.SpecieCategory;
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
	
	public void goCreateCustomer() {
		app.createCustomer();
	}
	
	public void goCreateSpecies() {
		app.createSpecies();
	}
	
	public void goCreateCategory() {
		app.createCategory();
	}
	
	public void submitForm(String client, String cat, String spe, String analysis, int nbr) {
		if (nbr <= 0){
			view.error();
		}
		else{
			for (Customer c : app.getDatas().getCustList().getListe()){
				if (c.getName().equals(client))
					for (SpecieCategory sc : app.getDatas().getCatList().getListe()){
						if(sc.getName().equals(cat)){
							for (Specie s : sc.getSpecies()){
								if(s.getName().equals(spe)){
									if(analysis.equals("Sexing test")){
										Order ord = new Order(c, sc, s, nbr);
										c.addOrder(ord);
										view.validate();
									}else{
										Order ord = new Order(c, sc, s, nbr);
										c.addOrder(ord);
										view.validate();
									}
								}
							}
						}
					}
			}
		}
	}

	public AppController getApp() {
		// TODO Auto-generated method stub
		return app;
	}
}

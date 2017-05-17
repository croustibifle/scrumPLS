package controllers;

import core.Datas;
import user_interface.*;
import user_interface.secretary.*;
import user_interface.validator.*;

public class AppController {
	
	private MainFrame frame;
	private Datas datas;

	public AppController(Datas d){
		datas = d;
		frame = new MainFrame(this);
		homePage();
	}
	
	public void homePage(){
		HomeController c = new HomeController(this);
		frame.add(c.getView());
		frame.setVisible(true);
	}
	
	public void validatorMenu() {
		ValidMenuController c = new ValidMenuController(this);
		frame.getContentPane().removeAll();
		frame.add(c.getView());
		frame.validate();
		
	}
	
	public void orderVizualisation() {
		OrderVizuController c = new OrderVizuController(this);
		frame.getContentPane().removeAll();
		frame.add(c.getView());
		frame.validate();
	}
	
	public void scrapieTest() {
		// TODO Auto-generated method stub
	}
	
	public void secretaryMenu() {
		SecretaryMenuController c = new SecretaryMenuController(this);
		frame.getContentPane().removeAll();
		frame.add(c.getView());
		frame.validate();
	}
	
	public void createOrder() {
		CreateOrderController c = new CreateOrderController(this);
		frame.getContentPane().removeAll();
		frame.add(c.getView());
		frame.validate();
	}
	
	public void createCustomer() {
		CreateCustomerController c = new CreateCustomerController(this);
		frame.getContentPane().removeAll();
		frame.add(c.getView());
		frame.validate();
	}
	
	public void createSpecies() {
		CreateSpeciesController c = new CreateSpeciesController(this);
		frame.getContentPane().removeAll();
		frame.add(c.getView());
		frame.validate();
	}
	
	public void createCategory() {
		frame.getContentPane().removeAll();
		frame.add(new CreateCategory());
		frame.validate();
	}
	
	
	public MainFrame getFrame(){
		return frame;
	}
	
	public Datas getDatas(){
		return datas;
	}

}

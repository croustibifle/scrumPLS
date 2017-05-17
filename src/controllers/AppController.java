package controllers;

import user_interface.MainFrame;

public class AppController {
	
	private MainFrame frame;

	public AppController(MainFrame f){
		frame = f;
	}
	
	public void homePage(){
		HomeController h = new HomeController();
		frame.add(h.getView());
	}
}

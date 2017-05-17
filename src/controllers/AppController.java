package controllers;

import core.Datas;
import core.User;
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
		HomeController h = new HomeController(this);
		frame.add(h.getView());
		frame.setVisible(true);
	}
	
	public void validatorMenu() {
		frame.getContentPane().removeAll();
		frame.add(new ValidatorMenu());
		frame.validate();
		
	}
	
	public void secretaryMenu() {
		frame.getContentPane().removeAll();
		frame.add(new SecretaryMenu());
		frame.validate();
	}
	
	public User testCo(String login, String password){
		for (User u : datas.getUserList().getListe()) {
			if (login.equals(u.getPseudo()) && password.equals(u.getMdp())){
				return u;
			}
		}
		return null;
	}
	
	public MainFrame getFrame(){
		return frame;
	}
	
	public Datas getDatas(){
		return datas;
	}

}

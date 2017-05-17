package core;
import java.util.ArrayList;

import core.*;
public class Datas {

	private Customers custList;
	private ListeUsers userList;
	private CategoryList catList;
	
	public Datas()
	{
		custList = new Customers();
		userList = new ListeUsers();
		catList = new CategoryList();
	}

	public Customers getCustList() {
		return custList;
	}

	public ListeUsers getUserList() {
		return userList;
	}

	public CategoryList getCatList() {
		return catList;
	}
	
	public void addUser(String login, String password, String type){
		userList.addUser(login, password, type);
	}
	
	public User testCo(String login, String password){
		for (User u : userList.getListe()) {
			if (login.equals(u.getPseudo()) && password.equals(u.getMdp())){
				return u;
			}
		}
		return null;
	}
	
}

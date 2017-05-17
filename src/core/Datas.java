package core;
import java.util.ArrayList;

import core.*;
public class Datas {

	private Customers custList;
	private ListeUsers userList;
	private CategoryList catList;
	
	public Datas(Customers custList, ListeUsers userList, CategoryList catList)
	{
		this.custList = custList;
		this.userList = userList;
		this.catList = catList;
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
	
	public User testCo(String login, String password){
		for (User u : userList.getListe()) {
			if (login.equals(u.getPseudo()) && password.equals(u.getMdp())){
				return u;
			}
		}
		return null;
	}
	
}

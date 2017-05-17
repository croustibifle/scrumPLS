import java.util.ArrayList;

import core.*;
public class Datas {

	private ArrayList<Customer> custList;
	private ArrayList<User> userList;
	private CategoryList catList;
	
	public Datas()
	{
		custList = new ArrayList<Customer>();
		userList = new ArrayList<User>();
		catList = new CategoryList();
	}

	public ArrayList<Customer> getCustList() {
		return custList;
	}

	public ArrayList<User> getUserList() {
		return userList;
	}

	public CategoryList getCatList() {
		return catList;
	}
	
	
}

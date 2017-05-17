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
	
	
}

package core;
public class Datas {

	private Customers c;
	private ListeUsers l;
	private CategoryList cl;
	
	public Datas()
	{
		c = new Customers();
		l = new ListeUsers();
		cl = new CategoryList();
	}
	
	public Customers getCust()
	{
		return c;
	}
	
	public ListeUsers getUsers()
	{
		return l;
	}
	
	public CategoryList getCateg()
	{
		return cl;
	}
}

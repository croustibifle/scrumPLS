import core.*;
public class Data {

	private Customers c;
	private ListeUsers l;
	private CategoryList cl;
	
	public Data()
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

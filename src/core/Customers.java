package core;
import java.util.ArrayList;

public class Customers {
	private ArrayList<Customer> liste;
	
	public Customers()
	{
		liste = new ArrayList<Customer>();
	}
	
	public boolean addCustomer(String name, String city)
	{
		if(!name.isEmpty() && !city.isEmpty())
		{
			name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
			city = city.substring(0,1).toUpperCase() + city.substring(1).toLowerCase();
			for(Customer t : liste)
			{
				if(t.getName().equals(name) && t.getTown().equals(city))
				{
					return false;
				}
			}
			liste.add(new Customer(name, city));
		}
		return true;
	}
	
	public ArrayList<Customer> getListe()
	{
		return liste;
	}
}

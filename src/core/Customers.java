package core;
import java.util.ArrayList;

public class Customers {
	private ArrayList<Customer> liste;
	
	public Customers()
	{
		liste = new ArrayList<Customer>();
	}
	
	public void addCustomer(String name, String city)
	{
		if(!name.isEmpty() && !city.isEmpty())
		{
			name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
			city = city.substring(0,1).toUpperCase() + city.substring(1).toLowerCase();
			boolean b = true;
			for(Customer t : liste)
			{
				if(t.getName().equals(name) && t.getTown().equals(city))
				{
					b = false;
					break;
				}
			}
			if(b)
			{
				liste.add(new Customer(name, city));
			}
		}
	}
	
	public ArrayList<Customer> getListe()
	{
		return liste;
	}
}

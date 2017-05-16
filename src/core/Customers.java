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
			boolean b = true;
			for(Customer t : liste)
			{
				if(t.getName() == name && t.getTown() == city)
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
}

package core;

import java.util.*;

class Customer {

  private List<Order> orders;

  private String name;

  private String town;

  public final String getName() {
    return name;
  }

  public final String getTown() {
    return town;
  }

  /**
   * Constructor for the customer
   * 
   * @param n name of the customer
   * @param t town for the customer
   */
  public Customer(String n, String t) {
	if(!n.isEmpty())
	{
		n = n.substring(0,1).toUpperCase() + n.substring(1).toLowerCase();
	}
	if(!t.isEmpty())
	{
		t = t.substring(0,1).toUpperCase() + t.substring(1).toLowerCase();
	}
	name = n;
	town = t;
	orders = new ArrayList<Order>();
  }

  /**
   * Adds an order for this customer
   * 
   * @param theOrder the order to be added
   */
  public void addOrder(Order theOrder) {
	orders.add(theOrder);
  }

  public final List<Order> getOrders() {
    return orders;
  }

}

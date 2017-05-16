package core;

import java.util.*;

/**
 * Describes the orders for the customers
 */
public class Order {

	private Customer customer;
	private OrderStatus status = OrderStatus.inProgress;
	private ArrayList<Sample> samples;
	private Specie spec;
	private SpecieCategory catheg;
	private int nbSamples;
  
	/**
	 * Constructor for the Order
	 */
	public Order(Customer customer, SpecieCategory catheg, Specie spec, int nbSamples) {
		if(nbSamples <= 0)
		{
			return;
		}
		this.customer = customer;
		samples = new ArrayList<Sample>();
		this.nbSamples = nbSamples;
		this.catheg = catheg;
		this.spec = spec;
		status = OrderStatus.inProgress;
	}

	public final OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus value) {
		status = value;
	}

	public final Customer getCustomer() {
		return customer;
	}

	public List<Sample> getSamples() {
		return samples;
	}

	public void setSamples(ArrayList<Sample> s) {
		samples = s;
		status = OrderStatus.toAnalyze;
	}

}

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
			nbSamples = 1;
		}
		this.customer = customer;
		this.samples = new ArrayList<Sample>();
		this.nbSamples = nbSamples;
		this.catheg = catheg;
		this.spec = spec;
		status = OrderStatus.inProgress;
	}

	public final OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus value) {
		if(status != OrderStatus.completed)
		{
			if(value == OrderStatus.inAnalysis || value == OrderStatus.completed)
			{
				status = value;
			}
		}
	}

	public final Customer getCustomer() {
		return customer;
	}

	public List<Sample> getSamples() {
		return samples;
	}

	public void setSamples(Sample s) {
		if(samples.size() < nbSamples)
		{
			samples.add(s);
		}		
		if(samples.size() == nbSamples)
		{
			status = OrderStatus.toAnalyze;
		}
	}

	public Specie getSpecies()
	{
		return spec;
	}
	
	public SpecieCategory getCategory()
	{
		return catheg;
	}
	
	  public String toString(){
		  return "Order num" + (this.getCustomer().getOrders().indexOf(this)+1);
	  }
}

import controllers.AppController;
import core.*;

public class Main {

	public static void main(String[] args) {
		
		ListeUsers userList = new ListeUsers();
		userList.addUser("validator","validator", "validator");
		userList.addUser("secretary","secretary", "secretary");
		
		CategoryList catList = new CategoryList();
		catList.addCategory("Bird");
		SpecieCategory cat1 = catList.getListe().get(0);
		cat1.addSpecie(new Specie("Mountain Chickadee"));
		cat1.addSpecie(new Specie("Oak Titmouse"));
		cat1.addSpecie(new Specie("Ruby-crowned Kinglet"));
		cat1.addSpecie(new Specie("Verdin"));
		Specie sp1 = cat1.getSpecies().get(0);
		Specie sp2 = cat1.getSpecies().get(1);
		Specie sp3 = cat1.getSpecies().get(2);
		Specie sp4 = cat1.getSpecies().get(3);
		
		Customers custList = new Customers();
		custList.addCustomer("Parrot Academy", "London");
		custList.addCustomer("Parrot Universe", "London");
		Customer cust1 = custList.getListe().get(0);
		Customer cust2 = custList.getListe().get(1);
		
		cust1.addOrder(new Order(cust1, cat1, sp1, 2));
		cust1.addOrder(new Order(cust1, cat1, sp2, 2));
		cust2.addOrder(new Order(cust2, cat1, sp3, 4));
		cust2.addOrder(new Order(cust2, cat1, sp4, 4));
		Order o1 = cust1.getOrders().get(0);
		Order o2 = cust1.getOrders().get(1);
		Order o3 = cust2.getOrders().get(0);
		Order o4 = cust2.getOrders().get(1);
	
		o1.setSamples(new Sample(new SexingTest(sp1, 10, 10, 10, 10), sp1, o1));
		o1.setSamples(new Sample(new SexingTest(sp1, 5, 5, 5, 5), sp1, o1));
		
		o2.setSamples(new Sample(new SexingTest(sp2, 10, 10, 10, 10), sp2, o2));
		o2.setSamples(new Sample(new SexingTest(sp2, 5, 5, 5, 5), sp2, o2));
		
		o3.setSamples(new Sample(new SexingTest(sp3, 10, 10, 10, 10), sp3, o3));
		o3.setSamples(new Sample(new SexingTest(sp3, 5, 5, 5, 5), sp3, o3));
		
		o4.setSamples(new Sample(new SexingTest(sp4, 10, 10, 10, 10), sp4, o4));
		o4.setSamples(new Sample(new SexingTest(sp4, 5, 5, 5, 5), sp4, o4));
		
		Datas d = new Datas(custList, userList, catList);
		new AppController(d);
	}
}

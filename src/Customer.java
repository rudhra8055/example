import java.util.Map;

public class Customer {
	int id;
	String name;
	String loc;

	public Customer(int id, String name, String loc) {
		super();
		this.id = id;
		this.name = name;
		this.loc = loc;
	}


	public static void main(String[] args) {
		Map<Integer, Customer> c1=Map.of(1,new Customer(111, "karthik", "GNT"),2,new Customer(112, "Rudhra", "RPL"));
		c1.forEach((k,v)-> System.out.println(k+"---->"+v.id+" "+v.name+" "+v.loc));

	}

}

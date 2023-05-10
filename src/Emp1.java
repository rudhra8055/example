import java.util.List;

public class Emp1 {
	Integer id;
	String name;
	Double sal;

	public Emp1(Integer id, String name, Double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	public static void main(String[] args) {
		List<Emp1> emps = List.of(new Emp1(101, "rudhra", 10000.98), new Emp1(102, "karthik", 3000.87),
				new Emp1(103, "chandu", 3000.76), new Emp1(104, "tarun", 6000.43));
		emps.stream().filter(emp1 -> emp1.name.contains("rudhra"))
				.forEach(emp -> System.out.println(emp.id + " " + emp.name + " " + emp.sal));
		System.out.println("*****************");

		double count = emps.stream().filter(emp2 -> emp2.sal > 3000).count();
		System.out.println(count);
		System.out.println("*****************");

		Emp1 e = emps.stream().filter(emp3 -> emp3.sal > 4000).findFirst().get();
		System.out.println(e.id + " " + e.name + " " + e.sal);

	}

}

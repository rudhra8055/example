import java.util.List;

public class MapMethodEx3 {
	String name;
	Integer id;
	double sal;

	public MapMethodEx3(String name, Integer id, double sal) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
	}

	public static void main(String[] args) {
		List<MapMethodEx3> emp = List.of(new MapMethodEx3("Rudhra", 101, 100.89),
				new MapMethodEx3("karthik", 102, 1005.89), new MapMethodEx3("chandu", 103, 1001.89));
		double total = emp.stream().filter(emps -> emps.sal > 100).map(emps1 -> emps1.sal + 5).mapToDouble(sal -> sal)
				.sum();
		System.out.println(total);
		System.out.println("************");

		emp.stream().filter(emp1 -> emp1.sal > 100).map(emp2 -> {
			emp2.sal = emp2.sal + 5;
			return emp2;
		})

				.forEach(emp3 -> System.out.println(emp3.id + " " + emp3.name + " " + emp3.sal));

	}

}

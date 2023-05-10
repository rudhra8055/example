import java.io.ObjectInputStream.GetField;
import java.util.List;

public class CarsEx1 {
	String name;
	String colour;
	double price;

	public CarsEx1(String name, String colour, double price) {
		super();
		this.name = name;
		this.colour = colour;
		this.price = price;
	}

	public static void main(String[] args) {
		List<CarsEx1> cars = List.of(new CarsEx1("bmw", "blue", 2600000.65), new CarsEx1("benz", "red", 3500000.76),
				new CarsEx1("tesla", "red", 4600000.87));
		cars.stream().filter(car -> car.name.contains("tesla"))
				.forEach(car -> System.out.println(car.name + " " + car.colour + " " + car.price));
		System.out.println("***********");
		cars.stream().filter(car -> car.price > 4500000)
				.forEach(car -> System.out.println(car.name + " " + car.colour + " " + car.price));
		System.out.println("***********");

		long count = cars.stream().filter(car -> car.colour.contains("red")).count();
		System.out.println(count);
		System.out.println("***********");

		CarsEx1 car1 = cars.stream().filter(car -> car.colour.contains("blue")).findFirst()

				.get();

		System.out.println(car1.name + " " + car1.colour + " " + car1.price);

	}

}

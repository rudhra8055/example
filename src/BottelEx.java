import java.util.Arrays;
import java.util.List;

public class BottelEx {
	String name;
	Integer Quantity;
	int price;
	String colour;

	public BottelEx(String name, Integer quantity, int i, String colour) {
		super();
		this.name = name;
		this.Quantity = quantity;
		this.price = i;
		this.colour = colour;
	}

	public static void main(String[] args) {
		List<BottelEx> bot= Arrays.asList(new BottelEx("Kinley", 1, 20, "blue"),
				                    new BottelEx("bisleri", 2, 30, "green"),
				                     new BottelEx("tupperware", 3, 40, "red"),
				                    null );
		Double bb=bot.stream()
				.filter(b->b!=null)
		.filter(b1->b1.colour.equals("red"))
		.map(b2->b2.price-5)
		.mapToDouble(price->price)
		.sum();
		System.out.println(bb);
		}

}

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FilterEx1 {

	public static void main(String[] args) {
		List<Integer> number = List.of(100, 200, 45, 4, 9, 7, 300, 4, 60, 9, 12);
		number.stream().filter(num -> num % 2 == 0).forEach(name1 -> System.out.println(name1));
		System.out.println("********");
		
		List<Integer> number1 = List.of(100, 200, 45, 4, 9, 7, 300, 4, 9);
		number1.stream().filter(num1 -> num1 % 2 != 0).forEach(name2 -> System.out.println(name2));
		System.out.println("********");

		Set<Integer> numbers = number.stream().filter(number3 -> number3 % 2 == 0).collect(Collectors.toSet());
		System.out.println(numbers);
		System.out.println("********");

		long count = number.stream().filter(num5 -> num5 % 10 == 0).count();
		System.out.println(count);

		Integer res = number.stream().filter(num6 -> num6 % 2 == 0 && num6 < 10).findFirst().get();

		System.out.println(res);
		System.out.println("********");
		Integer data = number.stream().filter(num7 -> num7 % 2 != 0 && num7 > 10).findFirst().orElse(null);
		System.out.println(data);

	}

}

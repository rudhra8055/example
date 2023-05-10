import java.util.List;

public class MapMethidEx1 {

	public static void main(String[] args) {
		List<Integer> num=List.of(1,2,3,4,5,6);
		num.stream()
		.map(number->number+2)
		.forEach(n->System.out.println(n));
		System.out.println("************");
		
		List<Integer> num1=List.of(1,2,3,4,5,6);
		num1.stream()
		.filter(n1->n1%2==0)
		.map(number->number*10)
		.forEach(n->System.out.println(n));
		System.out.println("************");
		
		List<String> names= List.of("Rudhra","Kranthi","Siva");
		names.stream()
		.map(name->name+" "+"Chandu")
		.forEach(n1->System.out.println(n1));

	}

}

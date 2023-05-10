import java.util.List;

public class ParllelStreamEx {

	public static void main(String[] args) {
		
		long start1=System.currentTimeMillis();
		List<Integer> num6= List.of(1,2,3,4,5,6,8,7);
		num6.stream()
		.filter(number->number%2==0)
		.map(nums->nums*10)
		.forEach(num1->System.out.println(num1));
		long end1=System.currentTimeMillis();
		System.out.println("Time is>"+(end1-start1));
		
		long start=System.currentTimeMillis();
		List<Integer> num= List.of(1,2,3,4,5,6,8,7);
		num.parallelStream()
		.filter(number->number%2==0)
		.map(nums->nums*10)
		.forEach(num1->System.out.println(num1));
		long end=System.currentTimeMillis();
		System.out.println("Time is>"+(end-start));
		System.out.println("***********");
		
	

	}

}

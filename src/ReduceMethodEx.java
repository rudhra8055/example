import java.util.List;

public class ReduceMethodEx {

	public static void main(String[] args) {
		List<Integer> num= List.of(1,2,3,4,5,6,7,8);
		int n=num.stream()
		.filter(num1->num1%2==0)
		.map(num2->num2*10)
		.reduce((n1,n2)->(n1+n2))
		.get();
		System.out.println(n);
		

	}

}

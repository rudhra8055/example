import java.util.List;
import java.util.stream.Collectors;

public class MapMethidEx2 {

	public static void main(String[] args) {
		List<String> name=List.of("ratan","raju","rani","devi","deyam");
	      name.stream()
		.filter(names->names.startsWith("r")&& names.length()==4)
		.map(name1->name1+" "+"soft")
		.forEach(n1->System.out.println(n1));
	      
	      List<Integer> num= List.of(2,4,6,10,31,20,50);
	     List<Integer>n1= num.stream()
	      .filter(num1->num1<=10 && num1%2==0) 
	      .map(n2->(int)Math.pow(n2, n2))
	      .collect(Collectors.toList());
	      System.out.println(n1);
		
		
	
		

	}

}

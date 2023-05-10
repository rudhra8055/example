import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SortingEx {

	public static void main(String[] args) {
		List<String> name= Arrays.asList("rudhra","karthik","siva","priya","roja","ramani");
		Collections.sort(name);
		System.out.println(name);
	    Collections.sort(name, Comparator.reverseOrder());
	    System.out.println(name);
	    System.out.println("************");
	    
	   name.sort((n1,n2)->n1.compareTo(n2));
	   System.out.println(name);
	   name.sort((n1,n2)->-n1.compareTo(n2));
	   System.out.println(name);
	   
	   System.out.println("*************");
	   
	  List<String> n= name.stream()
	   .filter(n1->n1.startsWith("r"))
	   .sorted()
	   .collect(Collectors.toList());
	  System.out.println(n);
	  
	  Set<String> n1= name.stream()
			   .filter(n2->n2.startsWith("r"))
			   .sorted(Comparator.reverseOrder())
			   .collect(Collectors.toSet());
			  System.out.println(n1);
			  System.out.println("*************");
	  
	  List<Integer> num= Arrays.asList(1,4,7,9,2,5);
	  Collections.sort(num);
	  System.out.println(num);
	  Collections.sort(num,Comparator.reverseOrder());
	  System.out.println(num);
	  System.out.println("*************");
	  num.sort((n3,n2)->n3.compareTo(n2));
	  System.out.println(num);
	  num.sort((n3,n2)->-n3.compareTo(n2));
	  System.out.println(num);
	  System.out.println("*************");
	  
	 
	List<Integer> s= num.stream()
	  .filter(n4->n4%2==0)
	  .sorted()
	  .collect(Collectors.toList());
	 System.out.println(s);
	  
	  
	  
	  
	  
	   
	}

}

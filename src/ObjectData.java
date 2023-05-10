import java.util.Arrays;
import java.util.List;

public class ObjectData {
	int id;
	String name;
	String Author;	
public ObjectData(int id, String name, String Author) {
	super();
	this.id = id;
	this.name = name;
	this.Author = Author;
}
public static void main(String[] args) {
	List<ObjectData> book= Arrays.asList(new ObjectData(101, "java", "james"),
			new ObjectData(102, " core java", "james goslin"),
			new ObjectData(103, " adv java", "ratan"));
			book.forEach(str->System.out.println(str.id+" "+ str.name+" "+str.Author));
	

}
}

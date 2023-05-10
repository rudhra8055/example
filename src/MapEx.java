import java.util.Map;

public class MapEx {

	public static void main(String[] args) {
		Map<String, Integer> fruits= Map.of("grapes",1,"apple",3,"orange",7);
		fruits.forEach((k,v)->System.out.println(k+"--------->"+v));

	}

}

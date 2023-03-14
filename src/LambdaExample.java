import java.util.ArrayList;
import java.util.List;

public class LambdaExample {

	public static void main(String[] args) {
		List<String> list= new ArrayList<>();
		list.add("vanita");
		list.add("sandeep");
		list.forEach(p-> System.out.println(p));
	}

}

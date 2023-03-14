import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		
//		List<Integer> list= new ArrayList<>();
//		for(int i=0;i<10;i++) {
//			list.add(i);
//		}
//		//System.out.println(list);
//
//		Stream<Integer> stream=list.stream();
//		//System.out.println(stream);
//		
//		Stream<Integer> parallelStream=list.parallelStream();
//		
//		
//		Stream<Integer> highNum= parallelStream.filter(p->p>5);
//		highNum.forEach(a->System.out.print(a));
		
		List<Integer> l=List.of(2,4,5,7,8);
		List<Integer> evenList=l.stream().filter(a->a%2==0).collect(Collectors.toList());
		System.out.println(l);
		System.out.println(evenList);
		
	}

}

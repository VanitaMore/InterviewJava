import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<Integer>(Arrays.asList(10,20,30,40));
        System.out.println(list);
        List<Integer> s=list.stream().filter(i->i>20).collect(Collectors.toList());
        System.out.println(s);
        
        List<Integer> collect = list.stream().map(i->i+5).collect(Collectors.toList());
        System.out.println(collect);
        
        //terminal operations
        Stream<Integer> s1=Stream.of(1,2,3,4,5,6);
		/*
		 * Object[] array = s1.toArray(); for(Object a:array) { System.out.print(a); }
		 */
        long count = s1.count();
        System.out.println(count);
        
        Stream<Integer> s2=Stream.of(1,0,3,4,5);
        Optional<Integer> min = s2.min((o1,o2)->o1.compareTo(o2));
        System.out.println(min.get());
	}

}

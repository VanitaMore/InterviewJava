import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		/*
		 * Predicate<Integer> p=i->i>50; System.out.println(p.test(10));
		 * 
		 * Predicate<String> p1=s->s.length()>5; System.out.println(p1.test("van"));
		 */
		
		int x[]= {2,3,4,5,8,9,6};
		Predicate<Integer> p1=i->i%2==0;
	Predicate<Integer> p2=i->i>2;
		m1(p1.or(p2),x);
	}
	
	public static void m1(Predicate<Integer> p,int x[]) {
		for(int j:x)	
		{
			if(p.test(j))
				System.out.print(j);
		}
	}

}

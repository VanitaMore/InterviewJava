
public class FunctionalInterface {
	public static void main(String[] args) {
		
		Test t = (int x,int y)->System.out.println(x+y);
		System.out.print("result is=");
		t.abstract_func(5,5); 
	}
	




}

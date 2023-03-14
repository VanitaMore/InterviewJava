
public class ExampleGarbageCollector {

	public void finalize() {
		System.out.println("hi");
		int a=10/0;
	}
	public static void main(String[] args) {
		ExampleGarbageCollector t1=new ExampleGarbageCollector();
		ExampleGarbageCollector t2=new ExampleGarbageCollector();

		t1=t2;
		t2.finalize();
	}

}

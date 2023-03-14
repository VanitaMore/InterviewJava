
public interface Test {

	void abstract_func(int x,int y); 
	 
    default void default_Fun() 
   { 
        System.out.println("This is default method"); 
   } 
   // void add(int b)
}

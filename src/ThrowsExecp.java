
public class ThrowsExecp {

	static void test3() throws InterruptedException
    {
		 Thread.sleep(10000);
		 System.out.println("Inside fun(). ");
       
    }
	static void test2()  throws InterruptedException
	{
		test3();
	}
	static void test1()  throws InterruptedException
	{
		test2();
	}
	
    public static void main(String args[]) throws InterruptedException
    {
    	test1();
    }
}

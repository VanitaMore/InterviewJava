
public class Main {

	 static void status(int a) throws MyException{
		 if(a>25) {
			 System.out.println("success");
		 }else {
			 throw new MyException("exception occur");
		 }
	 }
	 public static void main(String args[]) throws MyException
	    {
		
		status(20);
	    }
}

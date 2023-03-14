import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * try { System.out.println(10/5); System.out.println("ratan".charAt(13));
		 * }catch (ArithmeticException | ClassCastException e) { System.out.println(" "
		 * +e); }catch (NumberFormatException | NullPointerException |
		 * StringIndexOutOfBoundsException a) { System.out.println(" " +a); }
		 * System.out.println(" rest ");
		 */
		try {
			FileInputStream fs=new FileInputStream("abc.txt");
			Thread.sleep(1000);
		}catch (FileNotFoundException | ClassCastException e) {
			System.out.println(" " +e);
		}catch (InterruptedException | ClassNotFoundException a) {
			System.out.println(" " +a);
		}
		System.out.println(" rest ");
	}

}

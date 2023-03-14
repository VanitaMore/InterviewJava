
public class ExcpHandlingProgm {

	public static void main(String[] args) {
		//System.out.println(10/0);
		try {
			System.out.println("ratan");
			System.exit(0);
		} finally {
			System.out.println("finally");
		}
		System.out.println("rest");
	}

}

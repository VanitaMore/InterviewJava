import java.util.Optional;

public class OptionalClassExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] str= new String[10];
		str[5]="jhgkgiuhikhykuhj";
		Optional<String> checkNull=Optional.ofNullable(str[5]);
		if(checkNull.isPresent()) {
			String str2=str[5].substring(2,5);
			System.out.println(str2);
		}else {
			System.out.println("no string");
		}
	}

}

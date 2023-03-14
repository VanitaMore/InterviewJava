
public class OptionalClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//In this example, we didn’t assign the value to the String str and we are trying to get the substring 
//out of it. Since there is no value present in the str, the program is throwing NullPointerException.

		String[] str=new String[10];
		str[9]="asdasfsdg";
		String str2=str[9].substring(2,5);
		System.out.println(str2);
	}

}

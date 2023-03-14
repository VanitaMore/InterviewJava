class Parent21{
	 Parent21 m() {
		System.out.println("parent");
		return this;
	}
}
public class ChildOverriding extends Parent21{

	ChildOverriding m() {
		System.out.println("child");
		return this;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildOverriding c=new ChildOverriding();
		c.m();
		
	}

}

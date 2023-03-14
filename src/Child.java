class Parent{
	void m1() {
		System.out.println("parent");
	}
}
 class Child extends Parent{

	 
	 void m1() {
			System.out.println("child m1");
		}
	 void m2() {
			System.out.println("child m2");
		}
	public static void main(String[] args) {
		Parent p=new Child();
		p.m1();
		//p.m2()
		Child c=(Child)p;
		c.m1();
		c.m2();

	}

}

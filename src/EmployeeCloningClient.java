
public class EmployeeCloningClient {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		Address address=new Address(11, "line1", "line2", "pune", 1234);
		
		EmployeeCloning employee1 = new EmployeeCloning(1001, "KK", 30, "kishan.javatrainer@gmail.com", "pass@123", address);
		System.out.println(employee1);
		
		EmployeeCloning employee2=(EmployeeCloning) employee1.clone();
		
		employee1.setName("vanita");
		employee1.getAddress().setAddressLine1("manjri");
		//employee2.setAge(40);
		System.out.println(employee2);
	}

}

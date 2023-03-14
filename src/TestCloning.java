
public class TestCloning {

	public static void main(String[] args) throws CloneNotSupportedException {

		Department hr = new Department(1, "Human Resource");

		Employee original = new Employee(1, "Admin", hr);
		//Lets create a clone of original object
		Employee cloned = (Employee) original.clone();

		//Let change the department name in cloned object and we will verify in original object
		cloned.getDepartment().setName("Finance");

		System.out.println(original.getDepartment().getName());
		System.out.println(cloned.getDepartment().getName());
	}
}

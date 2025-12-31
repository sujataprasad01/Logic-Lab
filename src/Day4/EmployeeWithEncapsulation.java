package Day4;

public class EmployeeWithEncapsulation {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.setName("Sujata");
		e.setSalary(9000);
		e.setSalary(120000);
		e.raise(10);
		e.raise(200);
	}

}

class Employee{
	private String name;
	private double salary;
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		if(salary>10000 && salary<500000) {
			this.salary = salary;
		}else {
			System.out.println("Salary should be in range 10000–500000");
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		 if (name == null) {
	            System.out.println("Invalid name!");
	        } else {
	            this.name = name;
	        }
	}
	
	public void raise(double percent) {
		if(percent>0 && percent<100) {	
			salary=salary+(salary*percent/100);
			System.out.println(salary);
		}else {
			System.out.println("Invalid percent");
		}
		
	}
}
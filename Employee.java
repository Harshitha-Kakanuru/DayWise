
public class Employee {
	 String name;
	    double salary;

	    Employee(String name, double salary) {
	        this.name = name;
	        this.salary = salary;
	    }
	}

	class Manager extends Employee {
	    String department;

	    Manager(String name, double salary, String department) {
	        super(name, salary);
	        this.department = department;
	    }
	    public void display() {
	        System.out.println("Name: " + name);
	        System.out.println("Salary: " + salary);
	        System.out.println("Department: " + department);
	    }
	    

   public static void main(String[] args) {
		 Manager m = new Manager("Raj", 50000, "Sales");
	     m.display();
	    }


}

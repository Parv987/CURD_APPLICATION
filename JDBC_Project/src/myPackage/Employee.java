package myPackage;

public class Employee {
	private int id,salary;
	private String name,email;
	public Employee(int id,String name,String email,int salary) {
		this.id=id;
		this.name=name;
		this.email=email;
		this.salary=salary;
	}
	public  int getId() {
		return id;
	}
	public int getSalary() {
		return salary;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	 public String toString() {
		 return "Employee [ id ="+id+", name ="+name+", email ="+email+", salary ="+salary+"]";
	 }

}

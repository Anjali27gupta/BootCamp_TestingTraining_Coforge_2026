package assignment3;
// WAP in Java using Encapsulation 
// data : empid, Name, salary
class EmpDetails{
	private  String ename;
	private  int empid;
	private  double salary;
	
	public void setEid(int id) {
		empid= id;
	}
	
	public void setName( String name) {
		ename= name;
	}
	public void setSalary( double amount) {
		salary= amount;
	}
	
	public void getEid() {
		System.out.println("Employee ID: "+ empid);
	}
	
	public void getName() {
		System.out.println("Employee Name: "+ ename);
	}
	public void getSalary() {
		System.out.println("Employee Salary: "+ salary);
	}
	
}
public class ID_details {

	public static void main(String[] args) {
		EmpDetails obj = new EmpDetails();
		obj.setEid(100);
		obj.setName("Stuti");
		obj.setSalary(50000);
		obj.getEid();
		obj.getName();
		obj.getSalary();

	}

}

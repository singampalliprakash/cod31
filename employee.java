package collections;

public class Employee 
{
	int id;
	String name;
	double salary;
	
	public Employee(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	

}


package collections;

import java.util.ArrayList;

public class AddToList3EmpObj 
{
	public static void main(String[] args) 
	{
		ArrayList<Employee> al=new ArrayList<Employee>();
		
		Employee emp1=new Employee(101, "Ram", 110000);
		Employee emp2=new Employee(102, "Prakash", 34000);
		Employee emp3=new Employee(103, "Vardhan", 77000);
		
		al.add(emp1);
		al.add(emp2);
		al.add(emp3);
		
		//for-each
		for(Employee o:al)
		{
			System.out.println(o);
		}
		
		//for loop
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}
		
		//reverse order
		for(int i=al.size()-1;i>=0;i--)
		{
			System.out.println(al.get(i));
		}
	}

}

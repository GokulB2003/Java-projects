package JDKFeatures.org;
import java.util.*;
/*: WAP to create a collection and store 5 employee data in it and fetch employee data whose salary is greater than 10000.
*/
import java.util.stream.*;

import java.util.function.*;
class Employee1
{
	private int id;
	private String name;
	private long salary;
	Employee1(int id,String name,long salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
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
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	
}
public class SalaryDataUsingStreamAPI {
	public static void main(String args[])
	{
		Employee1 emp1=new Employee1(1,"Ram",30000);
		Employee1 emp2=new Employee1(2,"Mahesh",40000);
		Employee1 emp3=new Employee1(3,"Raju",50000);
	
		
		List<Employee1>emp=List.of(emp1,emp2,emp3);
		Stream<Employee1>e=emp.stream().filter((Employee1 ex)->ex.getSalary()>10000?true:false);
		e.forEach(n->System.out.println(n.getId()+" "+n.getName()+" "+n.getSalary()));
				
		
		
	}
}

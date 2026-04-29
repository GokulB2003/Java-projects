package javaPreparation;
import java.util.*;
import java.util.stream.*;
import java.util.function.*;
class Employee
{
	private int id;
	private String name;
	private double salary;
	Employee(int id,String name,double salary)
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
public class EmployeeOp {

	public static void main(String[] args) {
		Employee obj1=new Employee(1,"ram",20000);
		Employee obj2=new Employee(2,"sham",3000);
		List<Employee>emp=List.of(obj1,obj2);
		Stream<Employee>s1=emp.stream();
		Predicate<Employee>p=new Predicate<>()
				{
					public boolean test(Employee e)
					{
						if(e.getSalary()>10000)
						{
							return true;
						}
						else
						{
							return false;
						}
					}
				};
				Stream<Employee>s2=s1.filter(p);
				s2.forEach(x->System.out.print(x.getId()+" "+x.getName()));
				
		
		// TODO Auto-generated method stub
		
	}

}

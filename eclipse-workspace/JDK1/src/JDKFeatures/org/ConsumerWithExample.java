package JDKFeatures.org;
import java.util.*;
import java.util.function.*;
class Employee{
	private int id;
	private long salary;
	private String name;
	Employee(int id,long salary,String name)
	{
		this.id=id;
		this.salary=salary;
		this.name=name;
	}
	public int getId()
	{
		return id;
	}
	public long getSalary()
	{
		return salary;
	}
	public String getName()
	{
		return name;
	}
}
public class ConsumerWithExample {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		List<Employee>list=List.of(new Employee(1,2000,"Raju"),new Employee(2,3000,"pinku"),new Employee(3,4000,"Ramesh"));
		Consumer<Employee>emp=(Employee e)->
					{
						System.out.println(e.getId());
						System.out.println(e.getName());
						
					};
		list.forEach(emp);
	}
}

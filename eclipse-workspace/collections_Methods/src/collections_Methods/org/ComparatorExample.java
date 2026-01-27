


package collections_Methods.org;
import java.util.*;
import java.lang.*;


class Employee
{
	private int id;
	private String name;
	private int rollNo;
	Employee(int id,String name,int rno)
	{
		this.id=id;
		this.name=name;
		this.rollNo=rno;
		
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
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
}
public class ComparatorExample  {

	public static void main(String[] args) {
		Employee emp1=new Employee(1,"sagar",3);
		Employee emp2=new Employee(5,"sag",0);
		Employee emp3=new Employee(2,"sa",300);
		Employee emp4=new Employee(4,"s",0020);
		Vector v=new Vector();
		v.add(emp1);
		v.add(emp2);
		v.add(emp3);
		v.add(emp4);
		//Before Sorting the data
		Iterator i=v.iterator();
		while(i.hasNext())
		{
			
			Employee obj=(Employee)i.next();
			System.out.println(obj.getName());
			System.out.println(obj.getRollNo());
			System.out.println(obj.getId());
			
		}
		Comparator c=new SortById();
		Collections.sort(v,c);
		
		System.out.println("After sorting by using the Id:");
		Iterator j=v.iterator();
		while(j.hasNext())
		{
			Employee emp=(Employee)j.next();
			System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getRollNo());
			
		}
		Comparator c1=new SortUsingRollNo();
		Collections.sort(v,c);
		System.out.println("After sorting by using the RollNo:");
		Iterator k=v.iterator();
		while(k.hasNext())
		{
			Employee emp=(Employee)k.next();
			System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getRollNo());
			
		}
		// TODO Auto-generated method stub

	}

}

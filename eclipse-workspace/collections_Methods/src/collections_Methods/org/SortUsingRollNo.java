package collections_Methods.org;
import java.util.*;
 class SortUsingRollNo implements Comparator {
	public int compare(Object first,Object second)
	{
		Employee emp1=(Employee)first;
		Employee emp2=(Employee)second;
		if(emp1.getRollNo()>emp2.getRollNo())
		{
			return 1;
		}
		else if(emp1.getRollNo()<emp2.getRollNo())
		{
			return -1;
		}
		else
		{
			return 0;
		}
		
	}

}

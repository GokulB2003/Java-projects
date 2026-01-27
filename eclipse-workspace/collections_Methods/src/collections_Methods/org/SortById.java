package collections_Methods.org;
import java.util.*;
public class SortById implements Comparator {
	public int compare(Object first,Object second)
	{
		Employee f1=(Employee)first;
		Employee f2=(Employee)second;
		if(f1.getId()>f2.getId())
		{
			return 1;
		}
		else if(f1.getId()<f2.getId())
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}

}

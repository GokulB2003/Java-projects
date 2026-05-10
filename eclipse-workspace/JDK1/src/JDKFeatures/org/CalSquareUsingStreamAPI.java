package JDKFeatures.org;
import java.util.stream.*;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.*;
public class CalSquareUsingStreamAPI {
	public static void main(String args[])
	{
		List.of(1,0,2,4,9,5).stream().filter(n->n%2==1).sorted().forEach(n->System.out.println(n));
		
		Predicate<Integer>p=(Integer q)->(q>10)?true:false;
				System.out.println(p.test(38));
		
	}

}

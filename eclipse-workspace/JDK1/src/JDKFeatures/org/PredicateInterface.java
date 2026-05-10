package JDKFeatures.org;
import java.util.*;
import java.util.function.*;

public class PredicateInterface {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Predicate<Integer>ans=(Integer val)->
					{
						if(val>10)
						{
							return true;
						}
						else
						{
							return false;
						}
					};
				//System.out.print(ans.test(10));
	}
}

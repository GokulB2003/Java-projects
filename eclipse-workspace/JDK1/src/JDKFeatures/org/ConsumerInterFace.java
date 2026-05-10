package JDKFeatures.org;
import java.util.*;
import java.util.function.*;

public class ConsumerInterFace {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Consumer<Integer> c=(Integer val)->
					{
						System.out.println(val);
						
					};
				c.accept(10);
	}
}

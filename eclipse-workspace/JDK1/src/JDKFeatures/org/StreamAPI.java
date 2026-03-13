package JDKFeatures.org;
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Stream.*;
import java.util.function.*;
public class StreamAPI {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	List<Integer>ans=List.of(10,3,30,5,40);
	Stream<Integer>data=ans.stream();
	//data.forEach(n->System.out.println(n));
	//data.forEach(n->System.out.println(n));//we can use or consume the Stream only once...do not reuse again..
	/*try {
	long count=(long) data.count();
	System.out.println(count);
	System.out.println(data.findFirst());
	}
	catch(Exception er)
	{
		System.out.println(er);
	}*/
	
	//Stream<Integer>result=data.sorted();//it gives a new Stream always..
	//result.forEach(n->System.out.println(n));
	
	//MAP method...
	
	//Stream<Integer>result=data.map(n->n*2);//Map Method takes argument and perform Operation..and print its..
	//result.forEach(n->System.out.println(n));
	
	//In one line........
	
	//ans.stream().map(n->n*2).forEach(n->System.out.println(n));//2 streams created...
	
	//Find only odd number values then multiply it by 2 with sorted order
	/*ans.stream()
				.filter(n->n%2==1)
					.sorted()
						.map(n->n*2)
							.forEach(n->System.out.println(n));
							*/
	
	
	
	/*Predicate<Integer>a=new Predicate<Integer>()
			{
				public boolean test(Integer val)
				{
					if(val%2==0)//find odd number 
					{
						return true;
					}
					else
					{
						return false;
					}
				}
			};
			
		*/
	
	//using Lamdaa->shortcut...
	/*Predicate<Integer>a=(Integer val)->val%2==1 ? true : false;
		
			ans.stream()
			.filter(a)
				.sorted()//sort in an Ascending order...
					.map(n->n*2)
						.forEach(n->System.out.println(n));
			
			*/
			//Add The Odd Values and Print Its...Reduce Method...
	

			
			int result=ans.stream().reduce(0,(c,e)->c+e);
			System.out.println(result);
			
}
}

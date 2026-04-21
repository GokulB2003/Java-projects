package javaPreparation;
import java.util.*;
import java.util.stream.*;
import java.util.function.*;
public class StreamAPIFirstReapeating {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		List<Integer>arr=List.of(4,7,2,9,7,5,2,1);
		
	//	int arr[]= {4,7,2,9,7,5,2,1};
//		Stream s1=(Stream) Arrays.stream(arr);
		
		Stream<Integer>s1=arr.stream();
		Function<Integer,Integer>p=(Integer num)->num*num;
		Stream<Integer>s2=s1.map(p);
		
		Consumer<Integer>c=(Integer num)->System.out.println(num);
		s2.forEach(c);
		//Stream<Integer>n=s1.filter();
		
		
		
	}
}

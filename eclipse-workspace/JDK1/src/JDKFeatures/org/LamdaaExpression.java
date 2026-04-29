package JDKFeatures.org;
import java.util.*;
interface CalCube
{
	int show(int no);
}
public class LamdaaExpression {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		//int result=c.show(10);
		System.out.println(((CalCube)(no)-> no*no*no).show(10));
		
	}
}

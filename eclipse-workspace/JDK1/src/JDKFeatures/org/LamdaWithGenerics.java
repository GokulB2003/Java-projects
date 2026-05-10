package JDKFeatures.org;
import java.util.*;
import java.lang.*;

public class LamdaWithGenerics {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
			
			new Thread(()->{
				try
				{
					for(int i=0; i<10; i++)
					{
						System.out.println(i);
						Thread.sleep(1000);
					}
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}).start();
		//t.start();
	}
}

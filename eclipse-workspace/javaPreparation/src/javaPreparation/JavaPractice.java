package javaPreparation;
import java.util.*;

public class JavaPractice {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int arr[]= {5,1,3,4,7};
	int target=12;
	int count=0;
	for(int i=0; i<arr.length-2; i++)
	{
		for(int j=i+1; j<arr.length-1; j++)
		{
			for(int k=j+1; k<arr.length; k++)
			{
				if((arr[i]+arr[j]+arr[k])<target)
				{
					count++;
				}
			}
		}
	}
	System.out.println(count);
}
}

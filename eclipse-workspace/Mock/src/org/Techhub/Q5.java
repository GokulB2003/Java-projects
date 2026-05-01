package org.Techhub;
import java.util.*;
/*Q5. Write a java program to store list of strings in ArrayList and sort them based on string 
length.
Input : apple banana kiwi mango
Output:
kiwi 
apple 
mango 
banana*/
import java.lang.Comparable.*;
class SortData
{
	private String data;
	SortData(String str)
	{
		this.data=str;
	}
	public String getData()
	{
		return data;
	}
	public int compareTo(Object first)
	{
		SortData s=(SortData)first;
		if(s.getData().length()>this.getData().length())
		{
			return 1;
		}
		else if(s.getData().length()<this.getData().length())
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
	
}
public class Q5{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("How many words do u want to enter?");
		int n=sc.nextInt();
		
		List<String>list=new ArrayList<>();
		System.out.println("Enter the word");
		for(int i=0; i<=n; i++)
		{
			String s=sc.nextLine();
			list.add(s);
		}
		
//		int maxlength=0;
//		for(int i=0; i<list.size(); i++)
//		{
//			SortData s=new SortData(arr);
//		}
//		
//		for(int i=0; i<=maxlength; i++)
//		{
//			for(int j=0; j<list.size(); j++)
//			{
//				if(list.get(j).length()==i)
//				{
//					System.out.println(list.get(j));
//				}
//			}
//		}
		
		
	
		
		
		Collections.sort(list);
		
	}

}

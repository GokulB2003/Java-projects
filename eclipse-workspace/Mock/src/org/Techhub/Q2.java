package org.Techhub;
/*Q2. Write a java program to for each element, find next greater element to its right using 
ArrayList only.
Input: Array: 4 5 2 25
Output:
4 -> 5 
5 -> 25 
2 -> 25 
25 -> -1
*/
import java.util.*;


public class Q2 {
	public static void checkGreater(List<Integer>ans)
	{
		
		int val=-1;
		for(int i=0; i<ans.size(); i++)
		{
			int v=ans.get(i);
			boolean flag=true;
			for(int j=i; j<ans.size(); j++)
			{
				if(ans.get(j)>v)
				{
					System.out.println(v+":"+ans.get(j));
					flag=false;
					break;
				
				}
			}
			if(flag==true)
			{
				System.out.println(ans.get(i)+":"+val);
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer>ans=new ArrayList<>();
		ans.add(4);
		ans.add(5);
		ans.add(2);
		ans.add(25);
		
		checkGreater(ans);
	
		
	}

}

package org.Techhub;
/*Q1. Write a java program to find the element with highest frequency in an integer array using 
HashMap.
Input : Array: 1 2 2 3 3 3 4
Output: Element with highest frequency: 3 
 Frequency: 3*/
import java.util.*;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size of the Elements");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		
		LinkedHashMap<Integer,Integer>map=new LinkedHashMap<>();
		System.out.println("Enter the Elements in the Map:");
		for(int i=0; i<size; i++)
		{
			int n=sc.nextInt();
			if(!(map.containsKey(n)))
			{
				map.put(n, 1);
			}
			else
			{
				map.put(n,map.get(n)+1);
			}
		}
		
		int max=0;
		int k=0,v=0;
		for(Map.Entry<Integer,Integer>s:map.entrySet())
		{
			if(s.getValue()>max)
			{
				max=s.getValue();
				v=s.getValue();
				k=s.getKey();
			}
		}
		System.out.println("Element with highest frequency:"+k+"Frequency:"+v);
	}

}

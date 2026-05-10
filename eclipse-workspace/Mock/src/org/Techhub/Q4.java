package org.Techhub;
import java.util.*;
/*Q4. Write a java program to given a sentence, count frequency of each word using HashMap.
Input : java is easy java is powerful
Output: java=2 
 is=2 
 easy=1 
 powerful=1
 */
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String str:");
		String str=sc.nextLine();
		
		String arr[]=str.split(" ");
		HashMap<String,Integer>map=new LinkedHashMap<>();
		
		for(int i=0; i<arr.length; i++)
		{
			if(!(map.containsKey(arr[i])))
			{
				map.put(arr[i],1);
			}
			else
			{
				map.put(arr[i],map.get(arr[i])+1);
			}
			
		}
		for(Map.Entry<String,Integer>s:map.entrySet())
		{
			System.out.println(s.getKey()+"="+s.getValue());
		}
		
	}

}

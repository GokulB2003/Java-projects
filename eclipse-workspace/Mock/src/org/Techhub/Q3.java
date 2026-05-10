package org.Techhub;
import java.util.*;
/*Q3. Write a java program to store each word of a sentence into an ArrayList and reverse each
word individually.
Input: java is powerful
Output: avaj si lufrewop
*/
public class Q3 {

	public static String reverse(String str)
	{
		String s="";
		for(int i=str.length()-1; i>=0; i--)
		{
			if(str.charAt(i)!=' ')
			{
				s+=str.charAt(i);
			}
			
		}
		return s;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String str:");
		String str=sc.nextLine();
		List<String>list=new ArrayList<>();
		
		String arr[]=str.split(" ");
		for(int i=0; i<arr.length; i++)
		{
			list.add(arr[i]);
		}
		String result="";
		for(int i=0; i<list.size(); i++)
		{
			
			String s=reverse(list.get(i));
			if(i!=list.size()-1)
			result+=s+" ";
			else
			result+=s;
			
		}
		System.out.println(result);
		
	}

}

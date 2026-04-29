package collections_Methods.org;
import java.util.*;
public class MapMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		ArrayList<Integer>ans=new ArrayList<>();
		for(int i=0; i<=5; i++)
		{
			int id=sc.nextInt();
			ans.add(id);
		}
		
		LinkedHashMap<Integer,Integer>map=new LinkedHashMap<>();
		for(int obj:ans)
		{
			map.put(obj,map.getOrDefault(obj,0)+1);
			
		}
		
		for(Map.Entry<Integer,Integer>entry:map.entrySet())
		{
			if(entry.getValue()==1)
			{
				System.out.println(entry.getKey()+" "+entry.getValue());
				System.out.println(" ");
			}
		}
	}

}

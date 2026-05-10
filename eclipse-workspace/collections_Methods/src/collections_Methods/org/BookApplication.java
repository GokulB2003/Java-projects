package collections_Methods.org;
import java.util.*;
class Book
{
	private int id;
	private int price;
	private String author;
	Book(int id,int price,String author)
	{
		this.id=id;
		this.price=price;
		this.author=author;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
}
public class BookApplication {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Vector v=new Vector();
		Book b1[]=new Book[5];
		for(int i=0; i<b1.length; i++)
		{
			System.out.println("Enter the id:");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the Author:");
			String author=sc.nextLine();
			System.out.println("Enter the price of the book");
			int p=sc.nextInt();
			
			b1[i]=new Book(id,p,author);
			v.add(b1[i]);
			
		}
		Iterator i=v.iterator();
		while(i.hasNext())
		{
			Object obj=i.next();
			Book b=(Book)obj;
			System.out.println(b.getAuthor()+" "+b.getId()+" "+b.getPrice());
		}
	}

}

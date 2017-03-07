import java.awt.List;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) 
	
	{
		
 		int a[]=new int[50];
		int wordcount=0;
		
		String s="India is a beautiful nation.i love my india ? Welcome! to india";
		String[] items=s.split("[[.]*[\\.]*|[!]*|[?]]+");
		ArrayList<String> itemlist=new ArrayList<String>();
		int count=0;
		for(String item:items)

		{
			
			count++;
			itemlist.add(item);
		}
		
		System.out.println("Sentense after split:"+itemlist+" and no of sentense is:"+count);
		
}	



import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("A");//("Athithi");
		list.add("B");//("Bakya");
		list.add("C");//("Chandra");
		list.add("D");//("Devi");
		Iterator iterator=list.iterator();
		System.out.println("List Elements :");
		while(iterator.hasNext())
			System.out.println(iterator.next()+"");
		System.out.println();
	
		
		
		
		
		

	}

}

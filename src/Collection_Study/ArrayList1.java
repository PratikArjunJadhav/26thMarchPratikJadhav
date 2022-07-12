package Collection_Study;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList1 {

	public static void main(String[] args) {
		
		// Declare ArrayList
		//ArrayList<int> al = new ArrayList<int>();
		//ArrayList<String> al = new ArrayList<String>();
		// List al = new ArrayList();
		
		ArrayList al = new ArrayList();
		
		// Add new elements to the arraylist
		
		al.add(100);
		al.add("Welcome");
		al.add(15.5);
		al.add('A');
		al.add(true);
		
		System.out.println(al);// OutPut : [100, Welcome, 15.5, A, true] 
		
		// size()
		System.out.println("Number of elements in Array list "+al.size());// OutPut:Number of elements in Array list 5
		
		// remove()
		al.remove(1);
		System.out.println(al);// OutPut:[100, 15.5, A, true] i.e. it removes Welcome having index of 1
		// add element 
		al.add(1, "Velocity");
		System.out.println(al);// add velocity having index of 1 i.e insertion
		
		// Retrieve specific element
		
		System.out.println(al.get(2));// OutPut: 15.5... Here 2 is index of element
		
		// change element/ replace
		al.set(1, "Training Centre");
		System.out.println(al);// OutPut:[100, Training Centre, 15.5, A, true]
		
		// Search : contains()// returns in Boolean value
		al.contains(100);
		System.out.println(al.contains(100));// OutPut:true
		System.out.println(al.contains(22));// OutPut:false
		
		// isEmpty()
		System.out.println(al.isEmpty());// OutPut:false
		
		//Writing methods
		
		//1. For loop 
		
//		for (int i=0; i<=al.size();i++)
//		{
//			System.out.println(al.get(i));
//		}
		//2. for each loop
//		System.out.println("==================");
//		for(Object z:al)
//		{
//		System.out.println(z);
//		}
//		
//		
//		//3. iterator()
//		System.out.println("=======Iterator below=========");
//		Iterator it = al.iterator();
//		while (it.hasNext())
//		{
//			System.out.println(it.next());
//		}
		//4.listiterator()
		System.out.println("=======ListIterator below=========");
		ListIterator itr= al.listIterator();
		
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

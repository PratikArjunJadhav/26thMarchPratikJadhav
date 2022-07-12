package CollectionUse;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_Study {

	public static void main(String[] args) {
		TreeSet t= new TreeSet();
		t.add(90);
	   // t.add("Pune");
		t.add(10);
		t.add(80);
		t.add(20);
		t.add(1);
		//t.add(null);
		System.out.println(t);
		System.out.println("====================");
		//for each loop
		
		for(Object kk:t)
		{
			System.out.println(kk);
		}
		System.out.println("====================");
		
		// Iterator loop
		Iterator it = t.iterator();
		 while(it.hasNext())
		 {
			 System.out.println(it.next());
		 }

	}

}

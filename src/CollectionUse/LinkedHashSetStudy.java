package CollectionUse;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetStudy {

	public static void main(String[] args) {
		
		LinkedHashSet ls= new LinkedHashSet();
		
		ls.add("Pune");
		ls.add("Pune");
		ls.add('A');
		ls.add(123);
		ls.add(12.234);
		ls.add(null);
		ls.add(null);
		ls.add(true);
		
		System.out.println(ls);
		
		//for loop
		//for each
		//iterator
		
		//1.for each
		for(Object l:ls)
		{ System.out.println(l);
		}
		System.out.println("============");
		//iterator
		Iterator it = ls.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("============");
		LinkedHashSet<Integer> lh1= new LinkedHashSet<>();
		lh1.add(90);
		lh1.add(10);
		lh1.add(80);
		lh1.add(20);
		lh1.add(1); 

		System.out.println(lh1);
		
	}

}

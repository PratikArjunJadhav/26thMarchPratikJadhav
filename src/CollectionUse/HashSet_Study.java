package CollectionUse;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Study {

	public static void main(String[] args) {
		HashSet hs= new HashSet();
		hs.add("Pune");
		hs.add("Pune");
		hs.add(null);
		hs.add(null);
		hs.add(123);
		hs.add(12.21);
		hs.add(true);
		hs.add('A');
		System.out.println(hs);//Output:[null, A, 12.21, Pune, 123, true]
		
		System.out.println(hs.size());//Output:6
		
		System.out.println(hs.isEmpty());//Output:false
		
		System.out.println(hs.clone());
		System.out.println("===============================");
		for(Object v:hs)
		{
			System.out.println(v);
		}
		System.out.println("==============for each loop=================");
		
		Iterator it = hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("==============Iterator loop=================");
	}

}

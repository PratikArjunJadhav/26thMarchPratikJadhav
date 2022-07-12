package CollectionUse;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector_Study {

	public static void main(String[] args) {
		Vector v = new Vector();
		
		v.add(100);
		v.add("Velocity");
		v.add(88.2f);
		v.add(100);
		v.add(null);
		v.add(null);
		
		System.out.println(v);// Output:[100, Velocity, 88.2, 100, null, null]
		System.out.println(v.capacity());// Output:10
		System.out.println(v.size());// Output:6
		System.out.println(v.isEmpty());// Output:false
		System.out.println(v.contains(1));// Output:false
		System.out.println(v.indexOf("Velocity"));// Output:1
		System.out.println(v.get(2));//Output : 88.2
		System.out.println(v);
		v.add(1,"Pune");
		System.out.println(v);// Output : [100, Pune, Velocity, 88.2, 100, null, null]
		v.remove(3);
		System.out.println(v);// Output : [100, Pune, Velocity, 100, null, null]
		System.out.println("==================");
		
		//1. for loop
		for(Object o:v)
		{
			System.out.println(o); // for each loop
		}
		System.out.println("========for loop============");
		
		//2. Iterator loop
		Iterator i= v.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("========Iterator loop============");
		
		//3. ListIterator loop
		ListIterator itr = v.listIterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("=========ListIterator loop===========");
		
		//4. Enumeration loop
		Enumeration en = v.elements();
				while(en.hasMoreElements())
				{
					System.out.println(en.nextElement());
				}
	    System.out.println("==========Enumeration loop==========");
	}

}

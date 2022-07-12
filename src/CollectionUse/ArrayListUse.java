package CollectionUse;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListUse {

	public static void main(String[] args) {
		
ArrayList al= new ArrayList();
		
		al.add("Velocity");//0
		al.add("May-21");//1
		al.add(90);//2
		al.add('A');//3
		al.add(99.99f);//4
		al.add("Velocity");//5
		al.add(null);//6
		al.add(null);//7
	
		
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.indexOf("Velocity"));
		System.out.println(al.lastIndexOf("Velocity"));
		System.out.println(al);
		al.set(3, 'B');//update
		System.out.println(al);
		System.out.println(al.isEmpty());
		System.out.println(al.contains(93));
		System.out.println(al.get(5));
		System.out.println(al);
		System.out.println("=========================");
		al.add(1, "MorningBatch");// right shift--> when you are inserting element in between arraylist
		
		System.out.println(al);
		
		al.remove(1);//left shit--> when you try to remove/delete from in between of arraylist
		
		System.out.println(al);

	}

}

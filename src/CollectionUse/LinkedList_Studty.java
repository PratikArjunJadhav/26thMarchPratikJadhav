package CollectionUse;

import java.util.LinkedList;

public class LinkedList_Studty {

	public static void main(String[] args) {
		
		LinkedList ss = new LinkedList();
		
		ss.add("abcd");
		ss.add(12345);
		ss.add(96.96);
		ss.add(1000);
		ss.add(null);
		ss.add(null);
		ss.add('A');
		
		System.out.println(ss);
		System.out.println(ss.size());
		System.out.println(ss.isEmpty());
		System.out.println(ss.contains(96.96));
		System.out.println(ss.getFirst());
		System.out.println(ss.getLast());
		System.out.println(ss.lastIndexOf(12345));
		System.out.println(ss.peek());
		System.out.println(ss.peekFirst());
		System.out.println(ss.peekLast());
		System.out.println(ss.poll());
		System.out.println(ss.pollFirst());
		System.out.println(ss.pollLast());
		System.out.println(ss.pop());
		//System.out.println(ss.push("aet"));
		
	}

}

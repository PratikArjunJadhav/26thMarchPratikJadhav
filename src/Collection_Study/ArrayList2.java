package Collection_Study;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList2 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.isEmpty();
        System.out.println(al.isEmpty());// Output: true
        
        al.add('x');
        al.add('y');
        al.add('z');
        al.add('a');
        al.add('b');
        al.add('c');
        
        //addAll
        ArrayList al_Duplicate = new ArrayList();
        al_Duplicate.addAll(al);
        System.out.println(al_Duplicate);// Output:[x, y, z, a, b, c]
         
        //removeAll
        al_Duplicate.removeAll(al);
        System.out.println(al_Duplicate);//Output: []
        
        System.out.println(al);// [x, y, z, a, b, c]
       
        // sort....collections.sort()
        Collections.sort(al);
        
       System.out.println("Elements in the Arreylist after sorting "+al);//Elements in the Arreylist after sorting [a, b, c, x, y, z]
	
	   Collections.sort(al,Collections.reverseOrder());
	   System.out.println("Elements in the Arraylist after reverse the order "+al);//Elements in the Arraylist after reverse the order [z, y, x, c, b, a]
	
	   // shuffling collections.shuffle()
	   Collections.shuffle(al);
	   System.out.println("After shuffling elements are "+al);
	
	
	}

}

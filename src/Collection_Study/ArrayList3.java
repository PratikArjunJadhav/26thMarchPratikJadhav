package Collection_Study;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList3 {

	public static void main(String[] args) {

		String str[] = {"Dog","Cat","Camle","Tiger","Lion"};
		for(String v:str)
		{
			ArrayList al = new ArrayList(Arrays.asList(str)); 
			System.out.println(al);
		}
	}

}

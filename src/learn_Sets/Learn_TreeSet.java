package learn_Sets;

import java.util.*;
public class Learn_TreeSet {

	public static void main(String[] args) {
//		to sort in ascending order if any comparator 
//		is not present
//		Can not contain null element and will show NullPointerException
		Set<Integer> ts=new TreeSet<>();
		ts.add(15);
		ts.add(13);
		ts.add(17);
		ts.add(1);
		ts.add(12);
//		ts.add(null);
		System.out.println(ts);
		
	}

}

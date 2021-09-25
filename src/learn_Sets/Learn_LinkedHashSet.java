package learn_Sets;

import java.util.*;
public class Learn_LinkedHashSet {

	public static void main(String[] args) {
		
		//To maintain insertion order 
		// can contain single null element
		Set<Integer> lhs=new LinkedHashSet<>();
		lhs.add(15);
		lhs.add(14);
		lhs.add(17);
		lhs.add(null);
		lhs.add(125);
		lhs.add(3);
		lhs.add(null);

		System.out.println(lhs);
		Iterator<Integer> it=lhs.iterator();

		ArrayList<Integer> al=new ArrayList();
		while(it.hasNext()) {
			al.add(it.next());
		}
		System.out.println(al);
	}
}

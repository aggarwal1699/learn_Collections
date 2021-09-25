package learn_Sets;
import java.util.*;
public class Learn_HashSet {

	public static void main(String[] args) {

		Set<Integer> hs=new HashSet<>();
		hs.add(15);
		hs.add(14);
		hs.add(45);
		hs.add(74);
		
		
		System.out.println(hs.add(15));
		System.out.println(hs.add(14));
		
		System.out.println(hs);
		
		hs.remove(15);
		System.out.println(hs);
		HashSet<Integer> hs1=new HashSet();
		hs1.add(14);
		hs1.add(19);
		hs1.add(13);
		hs1.add(17);
		hs1.add(45);
		
		//To find Intersection of two sets
		hs.retainAll(hs1); 
		System.out.println(hs);
		
		
		
		HashSet<Integer> hs2=new HashSet();
		hs2.add(14);
		hs2.add(29);
		hs2.add(13);
		hs2.add(17);
		hs2.add(47);
		
		//to find union of two sets
		hs1.addAll(hs2);
		System.out.println(hs1);
		
		
		//to find if a is subset of b or not
		
		System.out.println(hs1.containsAll(hs2));
		
		
	}

}

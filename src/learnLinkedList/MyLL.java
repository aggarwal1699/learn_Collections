package learnLinkedList;

import java.util.*;

public class MyLL {

	public static void main(String[] args) {

		List<Integer> ll=new LinkedList<>();
		ll.add(12);
		ll.add(15);
		ll.add(12);
		ll.add(14);
		ll.add(16);
		ll.add(17);
		ll.add(18);
		ll.add(10);
		ll.add(12);
		ll.add(15);
		ll.add(12);
		ll.add(14);
		ll.add(16);
		ll.add(17);
		ll.add(18);
		ll.add(10);
		
		System.out.println(ll);
		
		ll.add(2,99);
		System.out.println(ll);
		
		ll.remove(12);
		System.out.println(ll);
		
		List<Integer> ll1=new LinkedList<>();
		ll1.add(12);
		ll1.add(15);
		ll1.add(12);
		ll1.add(14);
		ll1.add(16);
		ll1.add(17);
		
		ll.removeAll(ll1);
		System.out.println(ll);
	}

}

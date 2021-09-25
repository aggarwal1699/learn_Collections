package learnLinkedList;
import java.util.*;
public class Learn_LinkedList {

	public static void main(String[] args) {

		List<String> fruits=new LinkedList<>();
		LinkedList<Integer> al=new LinkedList<Integer>();
		
		
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Grapes");
		System.out.println(fruits);
		
		
		List<String> vegies=new LinkedList<>();
		vegies.add("Potato");
		vegies.add("carrot");
		System.out.println(vegies);

		
		//addAll(Collection)
		fruits.addAll(vegies);
		System.out.println(fruits);
		
		
		//get(index)
		System.out.println(fruits.get(2));
		
		
		//set(index, value)
		fruits.set(1, "pineapple");
		System.out.println(fruits);

		
		//remove(index)
		fruits.remove(1);
		System.out.println(fruits);
		
		
		//removeAll(Collection)
		fruits.removeAll(vegies);
		System.out.println(fruits);
		
		
		//size()
		System.out.println(fruits.size());
		
		
		//contains(element)
		System.out.println(fruits.contains("Apple"));
		
		
		//isEmpty()
		System.out.println(fruits.isEmpty());
		
		
		//clear()
		fruits.clear();
		
		
		//toArray()
		String temp[]=new String[vegies.size()];
		vegies.toArray(temp);
		for(String e: temp) {
			System.out.println(e);
		}
		Object a[]=fruits.toArray();
		
		
		
		//iterator
		Iterator<String> it= vegies.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		//forEach Loop for arrayList
		
		for(String e: vegies) {
			System.out.println(e);
		}
	}

}

package learn_Maps;

import java.util.*;
public class Learn_HashMap {

	public static void main(String[] args) {
		Map<Integer, String> hm=new HashMap();
		hm.put(1, null);
		hm.put(1,"Alex");
		hm.put(2, "alen");
		hm.put(3,"Alex");
		hm.put(4, null);
		hm.put(null,"Alex"); 
		// single null key is allowed 
//			and that will store at starting
		
		hm.put(6, "alen");
		
		hm.put(6, null);
		hm.putIfAbsent(15, "value");
		System.out.println(hm);
		System.out.println(hm.get(1));
		
		System.out.println(hm.getOrDefault(19, "defaultValue"));
		System.out.println(hm.containsKey(15));
		System.out.println(hm.containsValue("Shubham"));
		
		System.out.println(hm.replace(15, "sam"));
		System.out.println(hm.replace(1, "Alex", "beer"));
		System.out.println(hm);
		
//		System.out.println(hm.remove(1));
		System.out.println(hm.remove(3,"Alex"));
		
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());
		for (Map.Entry m: hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getClass()+" "+m.getValue());
		}
	}

}

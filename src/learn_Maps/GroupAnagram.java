package learn_Maps;

import java.util.*;

public class GroupAnagram {

	public static Collection<List<String>> groupAnagram(String[] s){
		Map<String ,List<String>> m= new HashMap<>();
		for(String str:s) {
			char[] chAr=str.toCharArray();
			Arrays.sort(chAr);
			String sorted=new String(chAr);
			
			if(!m.containsKey(sorted)) {
				m.put(sorted, new LinkedList<String>());
			}
			m.get(sorted).add(str);
		}
		
		
		return  m.values();
	}
	
	public static void main(String[] args) {
		String[] s= {"eat","ate","cat","tac","dog","act","god","tea"};
		System.out.println(groupAnagram(s));
	}

}

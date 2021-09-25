package learnComparable;

import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		List<Student> s=new ArrayList<>();
		s.add(new Student(12,"Sam"));
		s.add(new Student(32,"Sam"));
		s.add(new Student(25,"Sam"));
		s.add(new Student(22,"Sam"));
		s.add(new Student(20,"Sam"));
		
		Collections.sort(s);
		
		s.forEach(System.out::println);
	}

}

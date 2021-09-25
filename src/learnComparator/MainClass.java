package learnComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {

		List<Student> s=new ArrayList();
		s.add(new Student(14,"dpam"));
		s.add(new Student(43,"bram"));
		s.add(new Student(22,"ashayam"));
		s.add(new Student(52,"lsam"));
		s.add(new Student(12,"dpam"));	
		
//		Collections.sort(s, new SortByNameThenMarks());
//	
		
//		Collections.sort(s,new Comparator<Student>(){
//		@Override
//		public int compare(Student a,Student b) {
//			return a.marks-b.marks;
//			
//		}
//	});
//	
		
//		Collections.sort(s, (o1,o2)->{if(o1.name.equals(o2.name)) {
//			return o1.marks-o2.marks;
//		}
//		else {
//			return o1.name.compareTo(o2.name);
//		}
//		});
//		
	
//		Collections.sort(s, (o1,o2)-> o1.name.compareTo(o2.name));
		
		Collections.sort(s, Comparator.comparing(Student::getName).thenComparing(Student::getMarks).reversed());
		System.out.println(s);
	}

}


class SortByNameThenMarks implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.name.equals(o2.name)) {
			return o1.marks-o2.marks;
		}
		else {
			return o1.name.compareTo(o2.name);
		}
		
	}
	
}
package learnStack;

import java.util.Stack;

public class DemoStack {

	public static void main(String[] args) {

		Stack<Integer> s=new Stack<Integer>();

		s.add(15);
		s.add(13);
		s.add(14);
		s.add(16);
		
		s.push(198);
		s.push(199);
		s.push(190);
		
		
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s);
	}

}
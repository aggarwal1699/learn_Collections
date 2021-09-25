package learnQueue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class DemoQueue {

	public static void main(String[] args) {
		
		Queue<Integer> q=new LinkedList();
		
		q.offer(12);
		System.out.println(q.poll());
		System.out.println(q.peek());
		
		Queue<Integer> q1=new LinkedList();
		q1.add(153);
		System.out.println(q1.remove());
		System.out.println(q1.remove());	//show exception due to remove element from empty queue
		q1.add(15);
		System.out.println(q1.element());

		Queue<Integer> q12=new ArrayDeque();
		Queue<Integer> q4=new ArrayDeque();
		
		
	}

}

package learnQueue;

public class MainQueue {

	public static void main(String[] args) {
		MyQueue<Integer> q=new MyQueue<>();
		q.enqueue(15);
		q.enqueue(14);
		System.out.println(q.dequeue());
	}

}

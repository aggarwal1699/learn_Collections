package learnDeque;

public class MyDeque<E> {
	
	Node<E> head, tail;
	
	public void addFirst(E data) {
		Node<E> toAdd=new Node<>(data);
		if(head==null) {
			head=toAdd;
			tail=toAdd;
			return;
		}
		head.next=toAdd;
		toAdd.prev=head;
		head=toAdd;
		System.out.println(tail.data+ " j");
	}
	
	void print() {
		Node<E> temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	public static class Node<E> {
		Node<E> next, prev;
		E data;
		public Node(E data) {
			this.data = data;
			this.next = this.prev = null;
		}
	}
}

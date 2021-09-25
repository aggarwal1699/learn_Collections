package learnLinkedList;

public class Replica_LinkedList<E> {

	Node<E> head;
	static class Node<E>{
		E data;
		Node<E> next;
		
		public Node(E data){
			this.data=data;
			next=null;
		}
	}
	public void add(E data) {
		
		Node<E> toAdd=new Node<E>(data);
		if(isEmpty()) {
		head=toAdd;	
		return;
		}
		Node<E> temp=head;
		while(temp.next!=null) {
			 temp=temp.next;
		}
		temp.next=toAdd;
	}
	void get(E index) {
		
	}
	public boolean isEmpty() {
		return head==null;
	}
	
	public E removeLast() throws Exception {
		Node<E> temp=head;
		
		if(temp==null) {
			throw new Exception("Can not remove from empty stack");
		}
		if(temp.next==null) {
			Node<E> toRemove=head;
			head=null;
			return (E)toRemove.data;
		}
		
		while(temp.next.next!=null) {
			temp=temp.next;
		}
		Node<E> toRemove=temp.next;
		temp.next=null;
		return (E) toRemove.data;
		
	}
	
	public E getLast() throws Exception{
		Node<E> temp=head;
		
		if(temp==null) {
			throw new Exception("can not get peek element from empty stack");
		}
		while(temp.next!=null) {
			temp=temp.next;
		}
		
		return temp.data;
		
	}
	
	public void print() {
		Node<E> temp=head;
		while(temp!=null) {
			System.out.print(temp.data+ " ");
			 temp=temp.next;
		}
		System.out.println();
	}

}

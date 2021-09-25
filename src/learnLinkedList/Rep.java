package learnLinkedList;

public class Rep {

	Node head;
	
	void add(int data) {
		Node toAdd=new Node(data);
		
		if(isEmpty()) {
			head=toAdd;
			return;
		}
		
		Node temp=head;
		while(temp.next!=null){
			temp=temp.next;
		}
		temp.next=toAdd;
	}
	boolean isEmpty() {
		
		return head==null;
	}
	
	void print() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	static class Node{
		Node next;
		int data;
		Node(int data){
			this.data=data;
			next=null;
		}
	}
}

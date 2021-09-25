package learnStack;

import learnLinkedList.Replica_LinkedList;

public class My_Stack_Implementation_With_LinkedList<E> {

	Replica_LinkedList<E> ll=new Replica_LinkedList<E>();
	void push(E e) {
		ll.add(e);
	}
	
	E pop() throws Exception {
		
		if(ll.isEmpty()) {
			throw new Exception("popping is not allowed from empty stack");	
		}
		return ll.removeLast();
	}
	
	void print() {
		ll.print();
	}
	
	E peek() throws Exception {
		if(ll.isEmpty()) {
			throw new Exception("peeking is not allowed from empty stack");	
		}
		return ll.getLast();
	}
}

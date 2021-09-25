package learnLinkedList;

public class Try_Replica {

	public static void main(String[] args) {
		Replica_LinkedList<Integer> ll=new Replica_LinkedList<Integer>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		
		ll.print();
		
		Rep ll1=new Rep();
		
		ll1.add(15);
		ll1.print();
	}

}

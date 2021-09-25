package learnStack;

public class Try_My_Stack {

	public static void main(String[] args) throws Exception {

		My_Stack_Implementation_With_LinkedList<Integer> s=new My_Stack_Implementation_With_LinkedList<Integer>();
		s.push(15);
		s.push(14);
		s.push(13);
		s.push(12);
		
		s.print();
		System.out.println(s.pop());
		System.out.println(s.peek());
	}

}

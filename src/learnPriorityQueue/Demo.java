package learnPriorityQueue;

import java.util.PriorityQueue;

public class Demo {

	public static PriorityQueue<Integer> findThreeMax(int ar[]) {
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		for(int i=0;i<3;i++) {
			pq.add(ar[i]);
		}
		for (int i=3;i<ar.length;i++) {
			if(ar[i]>pq.peek()) {
				pq.remove();
				pq.add(ar[i]);
			}
		}
		return pq;
		
	}
	public static void main(String[] args) {

		int ar[]= {1,2,4,9,1,7,11,3,5,7,8};
		System.out.println(findThreeMax(ar));
	}

}

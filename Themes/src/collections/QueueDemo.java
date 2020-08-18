package collections;

import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		for (int i=10; i>0; i--) {
				pq.add(i);
				System.out.print(i);
		}
		///priorityqueue sorts the data
		System.out.println("-------------");
			System.out.println(pq.peek());
			pq.poll();
			System.out.println(pq.peek());
			System.out.println(pq.size());

	}

}

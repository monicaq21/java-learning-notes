package java_3_notes;

import java.util.PriorityQueue;

public class Priority_Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue <Integer> queue = new PriorityQueue <Integer>();
		//sorts the queue by itself.		
		//priority queue is a sorting queue
		
		queue.add(3);
		queue.add(4);
		queue.add(7);
		queue.add(6);
		queue.add(10);
		queue.add(14);
		queue.add(2);
		
		//it is 2,3,4,6,7,10,14
		
		
		while (!queue.isEmpty()){
			System.out.println(queue.poll());
		}

		
		
	}

}

package practice;

import java.util.*;

public class PriorityQueueEx {

	public static void main(String[] args) {
		Queue pq = new PriorityQueue();
		pq.offer(3);	//pq.offer(new Integer(3));  오토박싱
		pq.offer(1);
		pq.offer(5);
		pq.offer(2);
		pq.offer(4);
		
		System.out.println(pq); 				//[1,2,3,4,5]
		System.out.println(pq.poll());			//1
		
		Object obj = null;
		
		//PriorityQueue에 저장된 요소를 하나씩 꺼낸다.
		while((obj = pq.poll()) != null)	//2 3 4 5 (1은 이미 꺼냄)
			System.out.println(obj);
	}

}

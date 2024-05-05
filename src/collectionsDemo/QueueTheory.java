package collectionsDemo;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTheory {

	public static void main(String[] args) 
	{
		// PriorityQueue
		Queue <Integer> q=new PriorityQueue<>();
		
		//priority queue sort the q
		
		for(int i=10;i>=1;i--)
		{
			q.add(i);
		}
		
		//PQueue : (front) 10 9 8 7 6 5 4 3 2 1 (rear)
		//sorts the array: (front) 1 2 3 4 5 6 7 8 9 10 (rear)

		
		//peek-obtaining head of the q
		//poll-removing the 
		
		System.out.println(q.peek());
		System.out.println("before polling size "+q.size());
		System.out.println(q.poll());
		System.out.println(q.peek());
		System.out.println("after polling size "+q.size());
		
		
		//another queue
		Queue <Integer> q1=new PriorityQueue<>();
		for(int i=1;i<=5;i++)
		{
			q1.add(i);
		}
		
		//PQueue : (front) 1 2 3 4 5 (rear)
		//sorts the array if unsorted
		System.out.println(q1.peek());
	}

}

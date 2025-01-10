package stack;
import java.util.PriorityQueue;
public class Queue {
	public static void main(String[] args) {
		PriorityQueue q=new PriorityQueue();
		
		q.add(34);
		q.add(74);
		q.add(44);
		q.add(64);
		
		System.out.println(q.peek());
		System.out.println(q);
		
		System.out.println(q.poll());
		System.out.println(q);
	}

}

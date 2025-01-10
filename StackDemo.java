package stack;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<Integer> s=new Stack<Integer>();
		
		s.push(27);
		s.push(44);
		s.push(87);
		
		System.out.println("Top of Stack:"+s.peek());
		
		System.out.println("Element Removed:"+s.pop());
	}

}

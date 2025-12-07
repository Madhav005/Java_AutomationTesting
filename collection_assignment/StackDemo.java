package collection_assignment;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<>();
		stack.push("Apple");
        stack.push("Banana");
        stack.push("Mango");
        stack.push("Orange");
        System.out.println("Stack elements: " + stack);
        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Stack after pop: " + stack);
        System.out.println("Is stack empty? " + stack.isEmpty());


	}

}

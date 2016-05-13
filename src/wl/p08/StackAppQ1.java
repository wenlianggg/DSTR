package wl.p08;

import java.util.Scanner;
import java.util.Stack;

public class StackAppQ1 {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please ener a word: ");
		String str = sc.next();
		while(!str.equalsIgnoreCase("quit")) {
			stack.push(str);
			System.out.print("Enter one more (quit to exit): ");
			str = sc.next();
		}
		
		System.out.println("The top element is " + stack.peek());
		System.out.print("Words in reverse order: ");
		while(!stack.empty()) {
			System.out.print(stack.pop() + " ");
		}
		System.out.println("\nInteractive Session Ended");
		sc.close();
	}
}

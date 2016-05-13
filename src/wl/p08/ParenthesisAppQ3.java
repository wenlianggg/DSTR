package wl.p08;

import java.util.Scanner;
import java.util.Stack;

public class ParenthesisAppQ3 {
	public static void main(String[] args) throws UnbalancedExpressionException {
		Stack<Character> cs = new Stack<Character>();
		Scanner expscan = new Scanner(System.in);
		System.out.print("Enter expression: ");
		char[] chararr = expscan.next().toCharArray();
		
		for (int i = 0; i < chararr.length; i++) {
			System.out.print(chararr[i]);
			if(chararr[i] == '(')
				cs.push('(');
			else if (chararr[i] == ')') {
				if (cs.isEmpty()) {
					System.out.println("Offending character: " + chararr[i]);
				} else {
					cs.pop();
				}
			} else if (chararr[i] == ' ') {
				i++;
			}
		}
		
		expscan.close();
		
		if (cs.isEmpty()) {
			System.out.println(cs.peek());
			throw new UnbalancedExpressionException();
		}
		
	}
}

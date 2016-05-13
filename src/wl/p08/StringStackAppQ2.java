package wl.p08;

import java.util.Scanner;
import java.util.Stack;

public class StringStackAppQ2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Character> charStack = new Stack<Character>();
		System.out.print("Enter string to be reversed: ");
		String str = sc.next();
		Character[] chars = str.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
		for (Character ch : chars) {
			charStack.push(ch);
		}
		sc.close();
		String rsStr = new String();
		while(!charStack.isEmpty())
			rsStr+=charStack.pop();
		System.out.println(rsStr);
	}
}

package codility.lesson7.nesting;

import java.util.Stack;

public class Solution {

	public static void main(String[] args) {
		String S1 = "(()(())())";
		String S2 = "())";
		System.out.println("s1 : " + solution1(S1));
		System.out.println("s2 : " + solution1(S2));
	}
	
	public static int solution1(String S) {
		Stack<Character> stack = new Stack<Character>();
		for(char ch : S.toCharArray()) {
			if(ch == '(') stack.push(ch);
			else {
				if(stack.isEmpty()) return 0;
				stack.pop();
			}
		}
		return stack.isEmpty() ? 1 : 0;
	}

}

package codility.lesson7.brackets;

import java.util.Stack;

public class Solution {

	public static void main(String[] args) {
		String S1 = "{[()()]}";
		String S2 = "([)()]";
		System.out.println(solution1(S2));
	}
	
	public static int solution1(String S) {
		Stack<Character> chStack = new Stack<Character>();
		for(int i=0; i<S.length(); i++) {
			char ch = S.charAt(i);
			if(ch == '{' || ch == '[' || ch == '(') {
				chStack.push(ch);
			} else {
				if(chStack.empty()) return 0;
				if(ch == '}' && chStack.pop() != '{') return 0;
				if(ch == ']' && chStack.pop() != '[') return 0;
				if(ch == ')' && chStack.pop() != '(') return 0;
			}
		}
		return chStack.isEmpty() ? 1 : 0;
	}

}

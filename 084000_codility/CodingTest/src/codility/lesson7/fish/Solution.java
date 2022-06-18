package codility.lesson7.fish;

import java.util.Stack;

public class Solution {

	public static void main(String[] args) {
		int[] A = {4,3,2,1,5};
		int[] B = {0,1,0,0,0};
		System.out.println(solution1(A, B));

	}
	
	public static int solution1(int[] A, int[] B) {
		Stack<Integer> fishStack = new Stack<Integer>();
		int count = 0;
		for(int i=0; i<A.length; i++) {
			if(B[i] == 1) {
				fishStack.push(A[i]);
			} else {
				while(!fishStack.isEmpty()) {
					int peekSize = fishStack.peek();
					if(peekSize > A[i]) break;
					else fishStack.pop();
				}
				if(fishStack.isEmpty()) count++;
			}
		}
		return count + fishStack.size();
	}

}

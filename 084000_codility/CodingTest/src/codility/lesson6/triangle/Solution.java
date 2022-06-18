package codility.lesson6.triangle;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A1 = {10, 2, 5, 1, 8, 20};
		int[] A2 = {10, 50, 5, 1};
		int[] A3 = {1, 2, 5, 5, 5, 8, 10};
		System.out.println(solution1(A1));
	}
	
	public static int solution1(int[] A) {
		if(A.length < 3) return 0;
		int count = 0;
		Arrays.sort(A);
		for (int i = 0; i < A.length - 2; i++) {
			long P = A[i], Q = A[i + 1], R = A[i + 2];
	    	if (P + Q > R) return 1;
		}
		return 0;
	}

}

package codility.lesson6.max_product_of_three;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		int[] A = {-3, 1, 2, -2, 5, 6};
		System.out.println(solution1(A));
	}
	
	public static int solution1(int[] A) {
		int N = A.length;
		Arrays.sort(A);
		int max = A[N-1] * A[N-2] * A[N-3];
		if(max < (A[N-1] * A[0] * A[1])) max = A[N-1] * A[0] * A[1];
		return max;
	}

}

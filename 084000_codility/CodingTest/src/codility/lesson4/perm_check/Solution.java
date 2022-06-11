package codility.lesson4.perm_check;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		int[] A1 = {4, 1, 3, 2};
		int[] A2 = {4, 1, 3};
		int[] A3 = {4, 1, 1, 3};
		System.out.println(solution1(A1));
		System.out.println(solution1(A2));
		System.out.println(solution1(A3));
		System.out.println(solution2(A1));
		System.out.println(solution2(A2));
		System.out.println(solution2(A3));

	}
	
	public static int solution2(int[] A) {
		Arrays.sort(A);
        for(int i=0; i<A.length; i++) {
            if(A[i] != (i+1)) return 0;
        }
        return 1;
	}
	
	public static int solution1(int[] A) {
		int max = 0;
        for(int subA : A) {
            max = Math.max(max, subA);
        }
        if(A.length == max) return 1;
        return 0;
	}

}

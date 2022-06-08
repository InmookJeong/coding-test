package codility.lesson3.tape_equilibrium;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		int[] A = {3,1,2,4,3};
//		solution1(A);
		solution2(A);
	}
	
	public static void solution2(int[] A) {
		int total = 0;
		for(int subA : A) {
			total += subA;
		}
		
		int min = Integer.MAX_VALUE;
		int sum = 0;
		for(int i=1; i<A.length-1; i++) {
            sum += A[i];
            min = Math.min(min, Math.abs(total - sum - sum));
        }
        System.out.println(min);
	}
	
	public static void solution1(int[] A) {
		int min = Integer.MAX_VALUE;
        for(int i=1; i<A.length; i++) {
            int frontSum=0, backSum=0;
            for(int j=0; j<i; j++) {
                frontSum += A[j];
            }
            for(int k=i; k<A.length; k++) {
                backSum += A[k];
            }
            min = Math.min(min, Math.abs(frontSum-backSum));
        }
        System.out.println(min);
	}

}

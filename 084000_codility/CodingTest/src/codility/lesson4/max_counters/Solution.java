package codility.lesson4.max_counters;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		int N = 5;
		int[] A = {3, 4, 4, 6, 1, 4, 4};
		int[] returnA = solution1(N, A);
		for(int subA : returnA) {
			System.out.println(subA);
		}
	}
	
	// Total 77% = Correctness : 100%, Performance : 60% 
	public static int[] solution1(int N, int[] A) {
		int max = 0;
		int[] counters = new int[N];
		for(int subA : A) {
			if(subA == (N+1)) Arrays.fill(counters, max);
			else {
				counters[subA-1] += 1;
				max = Math.max(max, counters[subA-1]);
			}
		}
		return counters;
	}
}

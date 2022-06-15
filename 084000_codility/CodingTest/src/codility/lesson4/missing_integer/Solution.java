package codility.lesson4.missing_integer;

import java.util.Arrays;
import java.util.HashSet;

public class Solution {

	public static void main(String[] args) {
		int[] A1 = {1, 3, 6, 4, 1, 2};
		int[] A2 = {1,2,3};
		int[] A3 = {-1, -3};
		System.out.println(solution2(A1));
		System.out.println(solution2(A2));
		System.out.println(solution2(A3));
	}
	
	public static int solution1(int[] A) {
		Arrays.sort(A);
		int before = 0;
		for(int subA : A) {
			if(subA <= before) continue;
			if(subA > (before+1)) return before+1;
			before = subA;
		}
		return before+1;
	}
	
	// 다른 사람 풀이
	public static int solution2(int[] A) {
		HashSet<Integer> set = new HashSet<Integer>();
		for(int subA : A) {
			set.add(subA);
		}
		for(int i = 1; i<1000001; i++) {
			if(!set.contains(i)) return i;
		}
		return 1;
	}

}

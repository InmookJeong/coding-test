package codility.lesson4.frog_river_one;

import java.util.HashSet;

public class Solution {

	public static void main(String[] args) {
		int[] A = {1, 3, 1, 4, 2, 3, 5, 4};
		System.out.println(solution2(5, A));

	}
	
	public static int solution2(int X, int[] A) {
		HashSet<Integer> countSet = new HashSet<Integer>();
		
		for(int i=0; i<A.length; i++) {
			countSet.add(A[i]);
			if(countSet.size() == X) {
				return i;
			}
		}
		
		return -1;
	}
	
	public static int solution1(int X, int[] A) {
		HashSet<Integer> countSet = new HashSet<Integer>();
		for(int i=1; i<=X; i++) {
			countSet.add(i);
		}
		
		for(int i=0; i<A.length; i++) {
			if(countSet.contains(A[i])) countSet.remove(A[i]);
			if(countSet.size() == 0) {
				return i;
			}
		}
		
		return -1;
	}

}

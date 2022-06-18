package codility.lesson6.distinct;

import java.util.Arrays;
import java.util.HashSet;

public class Solution {

	public static void main(String[] args) {
		int[] A = {2, 1, 1, 2, 3, 1};
		System.out.println(solution2(A));
	}
	
	public static int solution1(int[] A) {
		HashSet<Integer> setA = new HashSet<Integer>();
		for(int subA : A) {
			setA.add(subA);
		}
		return setA.size();
	}
	
	public static int solution2(int[] A) {
		return (int)Arrays.stream(A).distinct().count();
	}

}

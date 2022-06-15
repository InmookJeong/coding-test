package codility.lesson5.passing_cars;

public class Solution {

	public static void main(String[] args) {
		int[] A = {0, 1, 0, 1, 1, 0};
		System.out.println(solution2(A));

	}
	
	// 퍼포먼스 0%
	public static int solution1(int[] A) {
		int count = 0;
		for(int i=0; i<A.length; i++) {
			if(A[i] == 0) {
				for(int j=i+1; j<A.length; j++) {
					if(A[j] == 1) count++;
				}
			}
		}
		return (count > 1000000000) ? -1 : count;
	}
	
	// 퍼포먼스 80%
	public static int solution2(int[] A) {
		int zeroCount = 0;
		int count = 0;
		for(int subA : A) {
			if(subA == 0) zeroCount++;
			else count += zeroCount;
		}
		return (count > 1000000000) ? -1 : count;
	}
	
	// 100%
	public static int solution3(int[] A) {
		int zeroCount = 0;
		int count = 0;
		for(int subA : A) {
			if(subA == 0) zeroCount++;
			else count += zeroCount;
			if(count > 1000000000) return -1;
		}
		return count;
	}

}

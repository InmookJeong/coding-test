package codility.lesson5.count_div;

public class Solution {

	public static void main(String[] args) {
		int A = 6, B = 11, K = 2;
		System.out.println(solution2(A, B, K));
	}
	
	// 반복문 이용
	public static int solution1(int A, int B, int K) {
		int count = 0;
		for(int i=A; i<=B; i++) {
			if(i%K==0) count++;
		}
		return count;
	}
	
	// 다른 사람의 풀이
	public static int solution2(int A, int B, int K) {
		if(A % K == 0) return (B/K) - (A/K) + 1;
		return (B/2) - (A/2);
	}
}

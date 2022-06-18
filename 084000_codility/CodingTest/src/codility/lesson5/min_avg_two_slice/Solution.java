package codility.lesson5.min_avg_two_slice;

public class Solution {

	public static void main(String[] args) {
		int[] A = {4, 2, 2, 5, 1, 5, 8};
		System.out.println(solution2(A));
	}
	
	public static int solution1(int[] A) {
		double min = Integer.MAX_VALUE;
		int startPoint = 0;
		
		for(int i=0; i<A.length-1; i++) {
			int sum = A[i];
			for(int j=i+1; j<A.length; j++) {
				sum += A[j];
				double avg = (double)sum / (double)(j-i+1);
				min = Math.min(min, avg);
				if(min == avg) startPoint = i;
			}
		}	
		
		return startPoint;
	}
	
	public static int solution2(int[] A) {
		float min = (A[0] + A[1]) / 2.f;
		int startPoint = 0;
		for (int i = 2; i < A.length; ++i) {
			// 3개 범위일때 평균값
			float avg = (A[i] + A[i - 1] + A[i - 2]) / 3.f;
			
			// 가장 작은 평균 값일 경우 P의 값을 갱신한다.
			if (avg < min) { 
				min = avg;
				startPoint = i - 2;
			}
			
			// 2개 범위일때 평균값
			avg = (A[i] + A[i - 1]) / 2.f; 
			if (avg < min) {
				min = avg;
				startPoint = i - 1;
			}
		}
		return startPoint;
	}

}

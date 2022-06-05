package codility.lesson2.cyclic_Rotation;

public class Solution {

	public static void main(String[] args) {
		int[] A = {3, 8, 9, 7, 6};
		int K = 3;
		int[] returnA = solution(A, K);
		for(int rA : returnA) {
			System.out.println(rA);
		}
	}
	
	public static int[] solution(int[] A, int K) {
		if(A.length == 0) return A;
        for(int i=0; i<K; i++) {
            int latest = A[A.length-1];
            for(int j=A.length-2; j>=0; j--) {
                A[j+1] = A[j];
            }
            A[0] = latest;
        }
        return A;
	}

}

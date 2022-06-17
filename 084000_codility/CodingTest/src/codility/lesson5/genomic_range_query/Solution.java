package codility.lesson5.genomic_range_query;

import java.util.Arrays;

public class Solution {
	
	public static void main(String[] args) {
		String S = "CAGCCTA";
		int[] P = {2,5,0};
		int[] Q = {4,5,6};
		solution2(S, P, Q);
	}
	
	public static void solution1(String S, int[] P, int[] Q) {
		int[] result = new int[P.length];
		for(int i = 0; i<P.length; i++) {
			String subS = S.substring(P[i], Q[i]+1);
			if(subS.contains("A")) result[i] = 1;
			else if(subS.contains("C")) result[i] = 2;
			else if(subS.contains("G")) result[i] = 3;
			else result[i] = 4;
		}
		
		for(int r : result) {
			System.out.println("r : " + r);
		}
	}
	
	// 다른 사람의 풀이
	public static void solution2(String S, int[] P, int[] Q) {
		int N = S.length();
        int M = P.length;
        int[] result = new int[M];
        int[][] path = new int[4][N];
        switch (S.charAt(0)) {
            case 'A':
                path[0][0] = 1;
                break;
            case 'C':
                path[1][0] = 1;
                break;
            case 'G':
                path[2][0] = 1;
                break;
            case 'T':
                path[3][0] = 1;
                break;
        }
        
        for (int i = 1; i < N; i++) {
            char c = S.charAt(i);

            switch (c) {
                case 'A':
                    path[0][i] = path[0][i - 1] + 1;
                    path[1][i] = path[1][i - 1];
                    path[2][i] = path[2][i - 1];
                    path[3][i] = path[3][i - 1];
                    break;
                case 'C':
                    path[0][i] = path[0][i - 1];
                    path[1][i] = path[1][i - 1] + 1;
                    path[2][i] = path[2][i - 1];
                    path[3][i] = path[3][i - 1];
                    break;
                case 'G':
                    path[0][i] = path[0][i - 1];
                    path[1][i] = path[1][i - 1];
                    path[2][i] = path[2][i - 1] + 1;
                    path[3][i] = path[3][i - 1];
                    break;
                case 'T':
                    path[0][i] = path[0][i - 1];
                    path[1][i] = path[1][i - 1];
                    path[2][i] = path[2][i - 1];
                    path[3][i] = path[3][i - 1] + 1;
                    break;
            }
        }
    
        for (int i = 0; i < M; i++) {
            for (int p = 0; p < 4; p++) {
                int sub = 0;
                if (P[i] > 0) {
                    sub = path[p][P[i] - 1];
                }
    
                if (path[p][Q[i]] - sub > 0) {
                    result[i] = p + 1;
                    break;
                }
            }
        }
	}

}

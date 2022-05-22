package baekjoon.step_by_step._2775;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t  = scan.nextInt();
		int[] results = new int[t];
		for(int i=0; i<t; i++) {
			int k = scan.nextInt();
			int n = scan.nextInt();
			results[i] = count(k, n);
		}
		
		for(int result : results) {
			System.out.println(result);
		}
		scan.close();
	}
	
	public static int count(int k, int n) {
		if(n == 1) return 1;
		if(k == 0) return n;
		return count(k, n-1) + count(k-1, n);
	}

}

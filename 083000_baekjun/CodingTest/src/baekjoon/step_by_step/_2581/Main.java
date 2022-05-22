package baekjoon.step_by_step._2581;

import java.util.Scanner;

public class Main {
	
	public static boolean[] prime;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();
		
		prime = new boolean[n+1];
		getPrime();
		
		int sum = 0, min = Integer.MAX_VALUE;
		for(int i=m; i<=n; i++) {
			if(!prime[i]) {
				sum += i;
				if(min == Integer.MAX_VALUE) {
					min = i;
				}
			}
		}
		
		if(sum == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);
		}
		scan.close();
	}
	
	// 에라토스테네스 소수 찾는 방법
	public static void getPrime() {
		prime[0] = true;
		prime[1] = true;
		for(int i=2; i < Math.sqrt(prime.length); i++) {
			if(prime[i]) continue;
			for(int j = i*i; j<prime.length; j+=i) {
				prime[j] = true;
			}
		}
	}
}

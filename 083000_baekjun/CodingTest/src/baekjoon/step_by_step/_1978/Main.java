package baekjoon.step_by_step._1978;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int cnt = 0;
		for(int i=0; i<n; i++) {
			boolean isPrime = true;
			int num = scan.nextInt();
			if(num == 1) continue;
			for(int j=2; j<=Math.sqrt(num); j++) {
				if(num % j == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) cnt++;
		}
		System.out.println(cnt);
		scan.close();
	}

}

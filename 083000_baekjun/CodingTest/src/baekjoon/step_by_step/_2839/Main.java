package baekjoon.step_by_step._2839;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(getCount(n));
	}
	
	public static int getCount(int n) {
		int cnt = 0;
		if(n < 10) {
			if(n % 5 == 0) {
				cnt = n/5;
			} else if(n % 3 == 0) {
				cnt = n/3;
			} else if(n == 5 + 3) {
				cnt = 2;
			} else {
				cnt = -1;
			}
		} else {
			cnt += 1;
			int subtraction = n - 5;
			int subCnt = getCount(subtraction);
			if(subCnt == -1) {
				if(n % 3 == 0) {
					cnt = n/3;
				} else {
					cnt = -1;
				}
			} else {
				cnt += subCnt;
			}
		}
		return cnt;
	}
}

package baekjoon.step_by_step._1065;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OtherMain {

	public static void main(String[] args) throws IOException {
		int n = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		
		for(int i = 1; i <= n; i++) {
			if(Seq(i)) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
	
	public static boolean Seq(int n) {
		if(n < 100) {
			return true;
		}
		
		int n1 = n % 10;
		n = n / 10;
		int n2 = n % 10;
		int sub1 = n1 - n2;
		
		while(n >= 10) {
			int n3 = n % 10;
			n = n / 10;
			int n4 = n % 10;
			int sub2 = n3 - n4;
			
			if(sub1 != sub2) {
				return false;
			}
		}
		
		return true;
	}

}

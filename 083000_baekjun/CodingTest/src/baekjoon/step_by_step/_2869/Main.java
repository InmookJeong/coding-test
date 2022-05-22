package baekjoon.step_by_step._2869;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(token.nextToken());
		int b = Integer.parseInt(token.nextToken());
		int c = Integer.parseInt(token.nextToken());
		
		int day = (c-b) / (a-b);
		if((c-b) % (a-b) != 0) day++;
		System.out.println(day);
	}
	
	public static void failedMyMain() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(token.nextToken());
		int b = Integer.parseInt(token.nextToken());
		int c = Integer.parseInt(token.nextToken());
		
		int day = 1, upCnt = 0;
		while(true) {
			upCnt += a;
			if(upCnt >= c) {
				break;
			}
			upCnt -= b;
			day++;
		}
		System.out.println(day);
	}

}

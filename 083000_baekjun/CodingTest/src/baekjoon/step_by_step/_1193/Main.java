package baekjoon.step_by_step._1193;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		int idx=0, start=1;
		int beforeStart = start;
		int beforeIndex = idx;
		while(n >= start) {
			beforeIndex = idx-1;
			beforeStart = start;
			start = start+idx;
			idx++;
		}
		
		boolean evenNum = beforeIndex%2==0;
		int top = (evenNum) ? beforeIndex+1 : 1;
		int bottom = (evenNum) ? 1 : beforeIndex+1;
		
		for(int i=0; i<beforeIndex+1; i++) {
			int minusMum = (i==0) ? 0 : 1;
			if(evenNum) {
				top -= minusMum;
				bottom += minusMum;
			} else {
				top += minusMum;
				bottom -= minusMum;
			}
			if(beforeStart+i == n) {
				break;
			}
		}
		
		System.out.println(top + "/" + bottom);
	}
}

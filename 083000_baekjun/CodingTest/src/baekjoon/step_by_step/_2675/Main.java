package baekjoon.step_by_step._2675;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = Integer.parseInt(scan.nextLine());
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<count; i++) {
			String[] strArray = scan.nextLine().split(" ");
			int loopCnt = Integer.parseInt(strArray[0]);
			String str = strArray[1];
			for(int j=0; j<str.length(); j++) {
				char c = str.charAt(j);
				for(int k=0; k<loopCnt; k++) {
					sb.append(c);
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
		scan.close();
	}
}

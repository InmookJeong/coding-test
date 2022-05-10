package baekjoon.step_by_step._1316;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int groupCnt = 0;
		int inputCnt = Integer.parseInt(scan.nextLine());
		for(int i=0; i<inputCnt; i++) {
			String str = scan.nextLine();
			if(isGroupString(str)) groupCnt++;
		}
		
		scan.close();
		System.out.println(groupCnt);
	}
	
	public static boolean isGroupString(String str) {
		int idx=0;
		boolean isGroup = true;
		while(isGroup && idx < str.length()) {
			char ch = str.charAt(idx);
			int lastIdx = str.lastIndexOf(ch);
			if(lastIdx > idx) {
				for(int i=idx+1; i<=lastIdx; i++) {
					if(ch != str.charAt(i)) {
						isGroup = false;
						break;
					} else {
						idx++;
					}
				}
			} else {
				idx = lastIdx+1;
			}
		}
		
		return isGroup;
	}
}

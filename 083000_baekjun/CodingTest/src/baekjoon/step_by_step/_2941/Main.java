package baekjoon.step_by_step._2941;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		scan.close();
		
		int strLength = str.length();
		int cnt = 0;
		
		if(str.contains("dz=")) {
			str = str.replaceAll("dz=", " ");
			int croatiaCnt = (strLength - countByTrim(str)) / "dz=".length();
			cnt += croatiaCnt;
			strLength = countByTrim(str);
		}
		
		if(str.contains("c=")) {
			str = str.replaceAll("c=", " ");
			int croatiaCnt = (strLength - countByTrim(str)) / "c=".length();
			cnt += croatiaCnt;
			strLength = countByTrim(str);
		}
		
		if(str.contains("c-")) {
			str = str.replaceAll("c-", " ");
			int croatiaCnt = (strLength - countByTrim(str)) / "c-".length();
			cnt += croatiaCnt;
			strLength = countByTrim(str);
		}
		
		if(str.contains("d-")) {
			str = str.replaceAll("d-", " ");
			int croatiaCnt = (strLength - countByTrim(str)) / "d-".length();
			cnt += croatiaCnt;
			strLength = countByTrim(str);
		}
		
		if(str.contains("lj")) {
			str = str.replaceAll("lj", " ");
			int croatiaCnt = (strLength - countByTrim(str)) / "lj".length();
			cnt += croatiaCnt;
			strLength = countByTrim(str);
		}
		
		if(str.contains("nj")) {
			str = str.replaceAll("nj", " ");
			int croatiaCnt = (strLength - countByTrim(str)) / "nj".length();
			cnt += croatiaCnt;
			strLength = countByTrim(str);
		}
		
		if(str.contains("s=")) {
			str = str.replaceAll("s=", " ");
			int croatiaCnt = (strLength - countByTrim(str)) / "s=".length();
			cnt += croatiaCnt;
			strLength = countByTrim(str);
		}
		
		if(str.contains("z=")) {
			str = str.replaceAll("z=", " ");
			int croatiaCnt = (strLength - countByTrim(str)) / "z=".length();
			cnt += croatiaCnt;
			strLength = countByTrim(str);
		}
		
		cnt += str.replaceAll(" ", "").length();
		System.out.println(cnt);
	}
	
	public static int countByTrim(String str) {
		return str.replaceAll(" ", "").length();
	}
}

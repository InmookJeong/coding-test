package baekjoon.step_by_step._5622;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 다른 사람은 switch-case 또는 if를 사용
		// if(ch<67) else if(...)
		HashMap<String, Integer> dialMap = getDialMap();
		Scanner scan = new Scanner(System.in);
		char[] charArr = scan.nextLine().toCharArray();
		scan.close();
		
		int sec = 0;
		for(char ch : charArr) {
			sec += dialMap.get(String.valueOf(ch));
		}
		System.out.println(sec);
	}
	
	public static HashMap<String, Integer> getDialMap() {
		HashMap<String, Integer> dialMap = new HashMap<String, Integer>();
		dialMap.put("A", 3);
		dialMap.put("B", 3);
		dialMap.put("C", 3);
		dialMap.put("D", 4);
		dialMap.put("E", 4);
		dialMap.put("F", 4);
		dialMap.put("G", 5);
		dialMap.put("H", 5);
		dialMap.put("I", 5);
		dialMap.put("J", 6);
		dialMap.put("K", 6);
		dialMap.put("L", 6);
		dialMap.put("M", 7);
		dialMap.put("N", 7);
		dialMap.put("O", 7);
		dialMap.put("P", 8);
		dialMap.put("Q", 8);
		dialMap.put("R", 8);
		dialMap.put("S", 8);
		dialMap.put("T", 9);
		dialMap.put("U", 9);
		dialMap.put("V", 9);
		dialMap.put("W", 10);
		dialMap.put("X", 10);
		dialMap.put("Y", 10);
		dialMap.put("Z", 10);
		return dialMap;
	}
}

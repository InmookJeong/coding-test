package baekjoon.step_by_step._1157;

import java.util.Scanner;

public class Main {

	// TODO 기존 코드와 성능 비교해보기
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int[] cntArr = new int[26];
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch >= 'A' && ch <= 'Z')
				cntArr[ch-'A']++;
			else
				cntArr[ch-'a']++;
		}
		
		char maxChar = ' ';
		int count = 0;
		for (int i = 0; i < 26; i++) {
			if (cntArr[i] > count) {
				count = cntArr[i];
				maxChar = (char) (i + 65);
			} else if (cntArr[i] == count) {
				maxChar = '?';
			}
		}
		System.out.println(maxChar+"");
		scan.close();
	}
	
	// 실패한 나의 코드
	public void oldMain() {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine().toUpperCase();
		char[] cArr = str.toCharArray();
		char maxChar = ' ';
		int count = 0;
		for(char ch : cArr) {
			if(ch == maxChar) continue;
			int cnt = 0;
			for(char c: cArr) {
				if(c == ch) cnt +=1;
			}
			if(cnt > count) {
				count = cnt;
				maxChar = ch;
			} else if(cnt == count) {
				maxChar = '?';
				break;
			}
		}
		System.out.println(maxChar+"");
		scan.close();
	}
}
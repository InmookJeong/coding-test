package baekjoon.step_by_step._10809;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		int start = 97, end = 122;
		StringBuilder sb = new StringBuilder();
		for(int i=start; i<=end; i++) {
			char ch = (char)i;
			sb.append(s.indexOf(ch) + " ");
		}
		System.out.println(sb.toString());
		scan.close();
	}
}

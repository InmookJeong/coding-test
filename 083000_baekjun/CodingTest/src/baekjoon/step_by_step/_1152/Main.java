package baekjoon.step_by_step._1152;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		scan.close();
		StringTokenizer strToken = new StringTokenizer(str, " ");
		System.out.println(strToken.countTokens());
	}

}
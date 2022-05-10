package baekjoon.step_by_step._2908;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] numbers = scan.nextLine().split(" ");
		int max = 0;
		for(String number : numbers) {
			StringBuilder sb = new StringBuilder(number);
			int n = Integer.parseInt(sb.reverse().toString());
			max = Math.max(max, n);
		}
		System.out.println(max);
		scan.close();
	}
}

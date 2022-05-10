package baekjoon.step_by_step._11720;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = Integer.parseInt(scan.nextLine());
		String numbers = scan.nextLine();
		int sum = 0;
		for(int i=0; i<count; i++) {
			sum += Integer.parseInt(numbers.charAt(i)+"");
		}
		System.out.println(sum);
		scan.close();
	}
}
package baekjoon.step_by_step._8958;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		
		List<Integer> scores = new ArrayList<Integer>();
		for(int i=0; i<count; i++) {
			String oxResult = scan.next();
			if(oxResult.length() > 0 && oxResult.length() < 80) {
				char[] results = oxResult.toCharArray();
				int sum=0, score=1;
				for(char result : results) {
					if(result == 'O') {
						sum += score;
						score += 1;
					} else {
						score = 1;
					}
				}
				scores.add(i, sum);
			}
		}
		for(int score : scores) {
			System.out.println(score);
		}
		scan.close();
	}
}

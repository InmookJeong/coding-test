package baekjoon.step_by_step._4344;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		List<String> scoreRatio = new ArrayList<String>();
		for(int i=0; i<count; i++) {
			int studentCount = scan.nextInt();
			double sum = 0;
			List<Double> scores = new ArrayList<Double>();
			for(int j=0; j<studentCount; j++) {
				double score = scan.nextDouble();
				scores.add(score);
				sum += score;
			}
			double avg = sum / studentCount;
			long avgOverCnt = scores.stream().filter(s -> (s > avg)).count();
			double ratio = (double)avgOverCnt / (double)studentCount * 100;
			scoreRatio.add(String.format("%.3f", ratio)+"%");
		}
		for(String ratio : scoreRatio) {
			System.out.println(ratio);
		}
		scan.close();
	}

}

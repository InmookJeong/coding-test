package baekjoon.step_by_step._3052;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> remainders = new ArrayList<Integer>();
		for(int i=0; i<10; i++) {
			int number = scan.nextInt();
			if(number >= 0 && number <= 1000) {
				int remainder = number % 42;
				remainders.add(i, remainder);
			}
		}
		long count = remainders.stream().distinct().count();
		System.out.println(count);
		scan.close();

	}

}

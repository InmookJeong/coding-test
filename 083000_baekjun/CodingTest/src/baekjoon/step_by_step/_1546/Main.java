package baekjoon.step_by_step._1546;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Double> grades = new ArrayList<Double>();
		int count = scan.nextInt();
		if(count >= 0 && count <= 1000) {
			for(int i=0; i<count; i++) {
				double grade = scan.nextLong();
				grades.add(i, grade);
			}
		}
		
		double max = grades.stream().mapToDouble(Double::doubleValue).max().getAsDouble();
		double sum = 0;
		for(double grade : grades) {
			sum += (grade/max*100);
		}
		System.out.println((sum / count));
		scan.close();

	}
}
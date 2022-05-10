package baekjoon.step_by_step._1712;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inputs = br.readLine().split(" ");
		int a = Integer.parseInt(inputs[0]);
		int b = Integer.parseInt(inputs[1]);
		int c = Integer.parseInt(inputs[2]);
		int cnt = -1;
		if(c-b > 0) {
			cnt = a/(c-b) + 1;
		}
		System.out.println(cnt);
	}
}

package baekjoon.step_by_step._10757;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String numbers = br.readLine();
		StringTokenizer token = new StringTokenizer(numbers, " ");
		BigInteger a = new BigInteger(token.nextToken());
		BigInteger b = new BigInteger(token.nextToken());
		System.out.println(a.add(b));
	}
}

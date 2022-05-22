package baekjoon.step_by_step._10250;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = Integer.parseInt(br.readLine());
		String[] floorArray = new String[cnt];
		for(int i=0; i<cnt; i++) {
			StringTokenizer token = new StringTokenizer(br.readLine(), " ");
			int h = Integer.parseInt(token.nextToken());
			int w = Integer.parseInt(token.nextToken());
			int n = Integer.parseInt(token.nextToken());
			int line = 1;
			String floor = "";
			while(h*line < n) line++;
			if(line <= w) {
				floor = String.valueOf(n - (h*(line-1)));
			}
			if(line < 10) {
				floor += "0";
			}
			floorArray[i] = floor+line;
		}
		for(String f : floorArray) {
			System.out.println(f);
		}
		br.close();
	}
}

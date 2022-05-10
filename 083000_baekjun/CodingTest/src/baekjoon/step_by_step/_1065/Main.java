package baekjoon.step_by_step._1065;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if(n < 100) System.out.println(n);
		else {
			int cnt = 99;
			nLoop : for(int i=100; i<n+1; i++) {
				char[] nums = (i+"").toCharArray();
				int gap = Integer.parseInt(nums[0]+"") - Integer.parseInt(nums[1]+"");
				for(int j=1; j<nums.length-1; j++) {
					int gap2 = Integer.parseInt(nums[j]+"") - Integer.parseInt(nums[j+1]+"");
					if(gap2 != gap) continue nLoop;
				}
				cnt += 1;
			}
			System.out.println(cnt);
		}
		scan.close();
	}

}

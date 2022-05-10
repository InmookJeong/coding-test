package baekjoon.step_by_step._4673;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		int limit = 10000;
		
		List<Integer> selfNums = new ArrayList<Integer>();
		HashMap<Integer, Integer> notSelfNums = new HashMap<Integer, Integer>();
		for(int i=1; i<=limit; i++) {
			if(!notSelfNums.containsKey(i)) {
				selfNums.add(i);
			}
			notSelfNums = addNotSelfNums(i, notSelfNums);
		}
		
		for(int n : selfNums) {
			System.out.println(n);
		}
	}
	
	public static HashMap<Integer, Integer> addNotSelfNums(int i, HashMap<Integer, Integer> notSelfNums) {
		
		int notSelfNum = 0;
		if(i<10) {
			notSelfNum = i+i;
		} else {
			String numStr = String.valueOf(i);
			char[] numCh = numStr.toCharArray();
			notSelfNum = i;
			for(char n : numCh) {
				notSelfNum += Integer.valueOf(n+"");
			}
		}
		notSelfNums.put(notSelfNum, notSelfNum);
		
		return notSelfNums;
	}
}

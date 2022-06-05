package codility.lesson2.odd_occurrences_in_array;

import java.util.HashSet;

public class Solution {

	public static void main(String[] args) {
		int[] A = {9, 3, 9, 3, 9, 7, 9};
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A) {
        HashSet<Integer> aSet = new HashSet<Integer>();
        for(int subA : A) {
            if(aSet.contains(subA)) aSet.remove(subA);
            else aSet.add(subA);
        }
        return aSet.iterator().next().intValue();
    }

}

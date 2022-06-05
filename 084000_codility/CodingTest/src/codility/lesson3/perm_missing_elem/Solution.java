package codility.lesson3.perm_missing_elem;

import java.util.HashSet;

public class Solution {

	public static void main(String[] args) {
		int[] A = {2, 3, 1, 5};
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A) {
        HashSet<Integer> iSet = new HashSet<Integer>();
        for(int i=1; i<=A.length+1; i++) {
            iSet.add(i);
        }
        for(int i=0; i<A.length; i++) {
            if(iSet.contains(A[i])) iSet.remove(A[i]);
        }
        return iSet.iterator().next();
    }

}

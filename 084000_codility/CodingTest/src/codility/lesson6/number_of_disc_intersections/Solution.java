package codility.lesson6.number_of_disc_intersections;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		int[] A = {1, 5, 2, 1, 4, 0};
		System.out.println(solution1(A));
	}
	
	public static int solution1(int[] A) {
		if(A.length < 2) return 0;
		int count = 0;
		for(int j=0; j<A.length-1; j++) {
			int discRadiuse = A[j];
			int discLeft = j - discRadiuse;
			int discRight = j + discRadiuse;
			for(int k=j+1; k<A.length; k++) {
				int compareLeft = k - A[k];
				int compareRight = k + A[k];
				if(discLeft > compareRight || discRight < compareLeft) continue;
				count++;
				if(count > 10000000) return -1;
			}
		}
		return count;
	}
	
	public static int solution2(int[] A) {
		// main idea:
        // 1. store all the "lower points" and "upper points" of the discs
        // 2. count the intersections (if one upper point > one lower point)
        
        // note: use "long" for big numbers (be careful)
        long[] lower = new long[A.length];
        long[] upper = new long[A.length];
        
        for(int i=0; i<A.length; i++){
            lower[i] = i - (long)A[i]; // note: lower = center - A[i]
            upper[i] = i + (long)A[i]; // note: upper = center + A[i]
        }
        
        // "sort" the "lower points" and "upper points"
        Arrays.sort(upper);
        Arrays.sort(lower);
        
        int intersection = 0; // number of intersections
        int j=0; // for the lower points
        
        // scan the upper points
        for(int i=0; i<A.length; i++){
        
            // for the curent "j" (lower point)
            while( j < A.length && upper[i] >= lower[j]){
                    intersection = intersection + j; // add j intersections
                    intersection = intersection - i; // minus "i" (avoid double count) 
                    j++;
            }          
        }
        
        // for the overflow cases
        if(intersection > 10_000_000)
            return -1;
        
        return intersection; // number of intersections 
	}

}

package codility.lesson3.frog_jmp;

public class Solution {

	public static void main(String[] args) {
		System.out.println(solution(10, 85, 30));
	}
	
	public static int solution(int X, int Y, int D) {
        int remainDistance = Y-X;
        if(remainDistance == 0) return 0;
        int div = remainDistance / D;
        int remain = remainDistance % D;
        if(remain > 0) div += 1;
        return div;
    }

}

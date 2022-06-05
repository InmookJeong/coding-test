package codility.lesson1;

public class Solution {

	public static void main(String[] args) {
		int N = 1041;
		System.out.println(solution(N));
	}
	
	public static int solution(int N) {
		String binaryNum = Integer.toBinaryString(N);
        String regAllOneOrZero = "^0+$|^1+$|^1+0+$";
        if(binaryNum.matches(regAllOneOrZero)) {
            return 0;
        } else {
            int max = 0, gap=0;
            boolean pre = false;
            for(int i=0; i<binaryNum.length(); i++) {
                char binary = binaryNum.charAt(i);
                if(binary == '0') {
                    gap++;
                    pre = false;
                } else {
                    if(!pre) {
                        max = Math.max(max, gap);
                    }
                    gap = 0;
                    pre = true;
                }
            }
            return max;
        }
	}

}

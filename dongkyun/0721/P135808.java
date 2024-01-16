package level_1;

import java.util.*;

public class P135808 {
    public static int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        // {1, 1, 2, 2, 2, 2, 4, 4, 4, 4, 4, 4}
        
        for(int i = score.length - m; i >= 0; i -= m) {  // 한 상자의 최소값만 구하면되기 떄문에 m씩 차이를 둠 
        	answer += score[i] * m;
        }
        return answer;
    }
    
	public static void main(String[] args) {
		int arr[] = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
		System.out.println(solution(4, 3, arr));
	}
}

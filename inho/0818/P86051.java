import java.util.Arrays;
//numbers	result
//[1,2,3,4,6,7,8,0]	14
//[5,8,4,0,6,7,9]	6  0 4 5 6 7 8 9
class Solution {
    public int solution(int[] numbers) {
        int sum = 0;
        int answer = 0;

        Arrays.sort(numbers);

        for (int i=1;i<=9;i++) answer +=i; //총 합 구하기. 그냥 45라고 해도 됌

        for (int i=0;i<numbers.length;i++) sum += numbers[i]; // 배열 안의 합 구하기

        return answer-sum;
    }
}
public class P86051 {
}

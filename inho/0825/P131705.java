
//number	result
//[-2, 3, 0, 2, -5]	2
//[-3, -2, -1, 0, 1, 2, 3]	5
//[-1, 1, -1, 1]	0
class Solution {
    public int solution(int[] number) {
        int answer = 0;
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                for (int k = j + 1; k < number.length; k++) {
                    if (number[i] + number[j] + number[k] == 0) answer++;
                }

            }
        }
        return answer;
    }
}

public class P131705 {
}

import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        int n = 0;
        for (int i = 0; i < citations.length; i++) {
            n = citations.length - i;

            if (citations[i] >= n) { //계속 돌다가 인용횟수가 넘을 때
                answer = n;
                break;
            }
        }

        return answer;
    }
}

public class P42747 {
    public static void main(String[] args) {

    }
}

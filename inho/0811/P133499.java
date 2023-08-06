class Solution {
    public int solution(String[] babbling) {
        int answer = 0;

        for (int i = 0; i < babbling.length; i++) {
            babbling[i] = babbling[i].replaceAll("ayaaya", "1");
            babbling[i] = babbling[i].replaceAll("yeye", "1");
            babbling[i] = babbling[i].replaceAll("woowoo", "1");
            babbling[i] = babbling[i].replaceAll("mama", "1");

            babbling[i] = babbling[i].replaceAll("aya|ye|woo|ma", ""); //하나씩 하기 귀찮아서 찾아보니 찾은 방법.

            if (babbling[i].equals("")) answer++;

        }
        return answer;
    }
}

public class P133499 {

}

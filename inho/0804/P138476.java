import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer, Integer> H = new HashMap<>();

        for (int i = 0; i < tangerine.length; i++) {
            H.put(tangerine[i], H.getOrDefault(tangerine[i], 0) + 1);
        } //getOrDefault()를 사용해서 해당 값이 존재할 때와 없을 때를 나눔

        List list = new ArrayList(H.values());  //벨류값들 가져와서
        Collections.sort(list, Collections.reverseOrder()); // 내림차순으로 정렬

        for (Object i : list) {
            k -= Integer.parseInt(i.toString());
            answer++;
            if (k < 1) break;
        }
        return answer;
    }
}

public class P138476 {

}

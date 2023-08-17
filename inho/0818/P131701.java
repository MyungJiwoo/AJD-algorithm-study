import java.util.HashSet;
import java.util.Set;

//elements	result
//[7,9,1,1,4]	18
class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        Set<Integer> set = new HashSet<>(); //중복값 안 넣기 위한 set

        for (int i = 1; i <= elements.length; i++) {
            for (int j = 0; j < elements.length; j++) {
                int sum = 0;
                for (int k = j; k < i + j; k++) {
                    sum += elements[k % elements.length];
                }
                set.add(sum);
            }
        }
        answer = set.size();
        return answer;
    }
}

public class P131701 {
}

package src.level2;

/*
level-2
연속 부분 수열 합의 개수

elements	result
[7,9,1,1,4]	18
 */

import java.util.HashSet;
import java.util.Set;

public class P131701 {
    public static void main(String[] args) {
        int[] elements = {7, 9, 1, 1, 4};

        System.out.println(solution(elements));
    }

    public static int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();

        for (int i = 1; i <= elements.length; i++) {
            for (int j = 0; j < elements.length; j++) {
                int sum = 0;
                for (int k = j; k < j + i; k++) {
                    sum += elements[k % elements.length];
                }
                set.add(sum);
            }
        }

        return set.size();
    }
}

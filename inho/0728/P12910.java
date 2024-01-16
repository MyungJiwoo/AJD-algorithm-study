//arr	divisor	return
//[5, 9, 7, 10]	5	[5, 10]
//[2, 36, 1, 3]	1	[1, 2, 3, 36]
//[3,2,6]	10	[-1]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public Integer[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>(); //배열의 길이를 지정하기 애매해서 list사용

        for (int i=0;i<arr.length;i++){
            if(arr[i]%divisor==0) list.add(arr[i]);
        }

        if(list.isEmpty()) list.add(-1);

        Integer[] answer = list.toArray(new Integer[list.size()]);
        Arrays.sort(answer);
        return answer;
    }
}

public class P12910 {
}

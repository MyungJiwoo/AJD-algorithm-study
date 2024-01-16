import java.util.Arrays;

//arr	return
//[4,3,2,1]	[4,3,2]
//[10]	[-1]
class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            int[] answer = {-1};
            return answer;
        }
        int[] answer = new int[arr.length - 1];
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == Arrays.stream(arr).min().getAsInt()) {
                continue;
            }
            answer[num++] = arr[i];
        }
        return answer;
    }
}
//다른 풀이
//class Solution {
//    public int[] solution(int[] arr) {
//
//        //배열 길이가 1인 경우 -1 반환
//        if (arr.length == 1) {
//            int[] answer = {-1};
//            return answer;
//        }
//        int[] answer = new int[arr.length - 1];
//        int min = arr[0]; //하나의 값을 기준으로 잡음.
//        for (int i = 0; i < arr.length; i++) {
//            min = Math.min(min, arr[i]);
//        }
//        int index = 0;  //반복문용 변수. 가장 작은 수가 여러개 일 수 있기 때문에 사용
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == min) {
//                continue;
//            }
//
//            answer[index++] = arr[i];
//        }
//
//        return answer;
//
//    }
//
//}

public class P12935 {
}

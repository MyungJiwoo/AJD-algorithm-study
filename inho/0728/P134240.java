
//food	result
//[1, 3, 4, 6]	"1223330333221"
//[1, 7, 1, 2]	"111303111"
class Solution {
    public String solution(int[] food) {
        String S = "";

        for (int i = 0; i < food.length - 1; i++) {
            for (int j = 0; j < food[i + 1] / 2; j++) {
                S += (i + 1);
            }
        }

        StringBuffer sb = new StringBuffer(S); //reverse를 쓰기 위해 생성
        sb.reverse();

        return S + "0" + sb.toString();
    }
}

public class P134240 {
}

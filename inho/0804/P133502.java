
class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ingredient.length; i++) {
            sb.append(ingredient[i]);
            // 길이가 3보다 크고 마지막 4자리가 "1231"일 때 까지
            if (sb.length() > 3 && sb.substring(sb.length() - 4, sb.length()).equals("1231")) {
                answer++;
                sb.delete(sb.length() - 4, sb.length()); // 햄버거 없애기
            }
        }

        return answer;
    }
}

public class P133502 {
}
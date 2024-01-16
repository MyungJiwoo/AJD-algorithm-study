package src.level1;

// level-1
// 핸드폰 번호 가리기

public class P12948 {
    public String solution(String phone_number) {
        StringBuilder answer = new StringBuilder();

        String x = "";

        for (int i = 0; i < phone_number.length() - 4; i++) {
            answer.append("*");
        }

        x = phone_number.substring(phone_number.length() - 4);
        answer.append(x);

        return answer.toString();
    }
}

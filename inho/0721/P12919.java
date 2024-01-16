class Solution {
    public String solution(String[] seoul) {
        int k = 0;
        for(int i=0; i<seoul.length;i++) {
            if (!seoul[i].equals("Kim")) {
                k++;
            } else break;
        }
        return "김서방은 "+k+"에 있다";
    }
}
public class P12919 {
}

class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String A = Integer.toString(a);
        String B = Integer.toString(b);
        if(Integer.parseInt(A+B)>2*a*b) answer = Integer.parseInt(A+B);
        else answer = 2*a*b;
        return answer;
    }
}
public class P181938 {
}

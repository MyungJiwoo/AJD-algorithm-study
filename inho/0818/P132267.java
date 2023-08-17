//a	b	n	result
//2	1	20	19
//3	1	20	9   10 5 2 1 1
class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while (n/a>0){
            answer += (n/a)*b;
            n = (n/a)*b+(n%a);

        }
        return answer;
    }
}
public class P132267 {
}

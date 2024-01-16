import java.util.Stack;

class Solution {
    public int solution(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) { //substring으로 회전시키기
            char first = s.charAt(0);
            s = s.substring(1) + first;
            if (discrimination(s)) {
                count++;
            }
        }
        return count;
    }


    public boolean discrimination(String S) { //Stack을 이용해서 풀기
        Stack<Character> stack = new Stack<>();
        char[] c = S.toCharArray();

        for (char data : c) {
            if (stack.isEmpty()) stack.push(data);
            else if (stack.peek()=='('&&data==')') stack.pop(); //바로 전에 들어간 값과 지금의 값을 비교해 괄호 짝이 맞는지 판별
            else if (stack.peek()=='['&&data==']') stack.pop();
            else if (stack.peek()=='{'&&data=='}') stack.pop();
            else stack.push(data);
        }
        if (stack.isEmpty()) return true;
        else return false;

    }
}
public class P76502 {
}

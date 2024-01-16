package level_0;

public class P181943 {
    public static String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        for(int i = 0; i < s; i++) {
        	answer += my_string.charAt(i);
        }
        answer += overwrite_string;
        for(int i = s + overwrite_string.length(); i < my_string.length(); i++) {
        	answer += my_string.charAt(i);
        }
        return answer;
    }

	public static void main(String[] args) {	
		System.out.println(solution("He11oWor1d", "lloWorl", 2));
		System.out.println(solution("hahahahahahahahha", "youretoslow", 4));	
	}
}

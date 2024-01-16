package level_1;

public class P134240 {
    public static String solution(int[] food) {
        String answer = "";
        
        for(int i = 1; i < food.length; i++) {
        	food[i] /= 2;
        	for(int j = 0; j < food[i]; j++) {
        		answer += i;
        	}
        }
        StringBuilder sb = new StringBuilder(answer);
        String reverse_answer = sb.reverse().toString();
        
        answer += 0;
        answer += reverse_answer;
        
        return answer;
    }
    
	public static void main(String[] args) {
		int food[] = {1, 3, 4, 6};
		System.out.println(solution(food));
	}

}

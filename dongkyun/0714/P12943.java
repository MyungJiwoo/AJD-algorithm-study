package level_1;

public class P12943 {
    public int solution(long num) {
        int answer = 0;
        
        while(true) {
        	if(answer == 500) {
        		answer = -1;
        		break;
        	}
        	if(num == 1)
        		break;
        	
        	if(num % 2 == 0) 
        		num /= 2;	
        	
        	else 
        		num = num * 3 + 1;
        	answer ++;
        	}		
        return answer;
    }

	public static void main(String[] args) {
	}

}

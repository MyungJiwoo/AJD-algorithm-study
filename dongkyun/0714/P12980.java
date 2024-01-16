package level_2;

public class P12980 {
    public static int solution(int n) {
    	int answer = 1;
    	
        while(true) {
        	if(n == 1)
        		break;
        	if(n % 2 == 0)
        		n /= 2;
        	else {
        		n--;
        		answer++;
        	}
        }
        
        return answer;
    }
	public static void main(String[] args) {
		System.out.println(solution(5));
		
	}

}

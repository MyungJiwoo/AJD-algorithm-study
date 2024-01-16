package level_2;

public class P12914 {
    public static long solution(int n) {
    	if(n==1)
    		return 1;
    	
        long a = 1;  
        long b = 2;
        for(int i = 3; i < n+1; i++) {
        	long answer = (a + b) % 1234567;
        	
        	a = b;
        	b = answer;
        }
        return b;
    }
   
	public static void main(String[] args) {
		System.out.println(solution(1000));
		

	}

}

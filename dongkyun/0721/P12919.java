package level_1;

public class P12919 {
	   public static String solution(String[] seoul) {
		   int answer = 0;
	        for(int i = 0; i < seoul.length; i++) {
	        	if(seoul[i].equals("Kim")) {
	        		answer = i;
	        		break;
	        	}
	        }
	        return "김서방은 " + answer + "에 있다";
	    }
	
	public static void main(String[] args) {
		String[] arr = {"Jane", "Kim"};
		System.out.println(solution(arr));

	}

}

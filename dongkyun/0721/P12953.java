package level_2;

import java.util.Arrays;

public class P12953 {
	private static int gcd (int a, int b) {  // 최대공약수
		
		if(a % b==0) 
			return b;
		else 
			return gcd(b, a%b);
	}
    public static int solution(int[] arr) {
        int answer = 0;
        int gcd1 = gcd(arr[0], arr[1]);  // 처음 두 수의 최대공약수
        answer = (arr[0] * arr[1]) / gcd1;
        
        if(arr.length == 1) { // 요소가 1개인 경우
        	return arr[0];
        }
        else if(arr.length == 2) {
        	return answer;
        }
        else {
        	for(int i = 2; i < arr.length; i++) {
        		gcd1 = gcd(answer, arr[i]);
        		answer = (answer * arr[i]) / gcd1;
        }
        }
        
        return answer;
    }
	public static void main(String[] args) {
		int arr[] = {1, 2, 3};
		System.out.println(solution(arr));
	}
}

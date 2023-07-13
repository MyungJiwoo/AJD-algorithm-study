package level_1;

public class P136798 {
    public int solution(int number, int limit, int power) {
        int answer = 0;
       
        for(int i = 1; i <= number; i++) { // 각 기사의 약수 구하기, i는 기사의 번호
        	int cnt = 0;  // 약수의 개수
        	for(int j = 1; j * j <= i; j++) {
        		if(j * j == i)
        			cnt++;
        		else if(i % j == 0)
        			cnt += 2;
        	}
        	if(cnt > limit)
    			answer += power;
    		else
    			answer += cnt;
        }
        
        return answer;
}
}

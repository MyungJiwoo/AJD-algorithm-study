class Solution {
	public int solution(int number, int limit, int power) {
		int answer = 0;
		for (int j = 1; j <= number; j++) { // number만큼
			int count = 0;
			for (int i = 1; i * i <= j; i++) { // 약수 개수 구히기
				if (i * i == j)
					count++;
				else if (j % i == 0)
					count += 2;
			}
			if (count > limit) {
				answer += power;
			} else
				answer += count;
		}

		return answer;
	}
}

public class P136798 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

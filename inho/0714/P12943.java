class Solution {
	public int solution(long num) { // 오버플로우 발생 방지로 int ->> long
		int count = 0;
		while (true) {
			if (count == 500) {
				count = -1;
				break;
			}
			if (num == 1) {
				break;
			}
			if (num % 2 == 0)
				num /= 2;
			else
				num = num * 3 + 1;
			count++;
		}
		return count;
	}
}

public class P12943 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

public class Solution {
	public int solution(int n) {
		int ans = 0;
		while (true) {
			if (n == 0)
				break;
			if (n % 2 == 0)
				n /= 2;
			else {
				n--;
				ans++;
			}

		}

		return ans;
	}
}

public class P12980 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

//�ϻ��� ��
class Solution {
	public boolean solution(int x) {
		String[] s = Integer.toString(x).split(""); // ���ڸ� ���ڿ� �迭�� �ϳ��� �߶� ����
		int sum = 0;
		for (int i = 0; i < s.length; i++) { //
			sum += Integer.parseInt(s[i]); // ����� ���ڿ� �迭 ������ ����
		}
		if (x % sum == 0)
			return true; // ���ڰ� �� �ڸ� ������ ������ ���������� true
		else
			return false;
	}
}

public class P12947 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

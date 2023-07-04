
class Solution {
	public int[] solution(int brown, int yellow) {
		int[] answer = new int[2];
		int sum = brown + yellow;

		for (int i = 1; i < sum; i++) {
			int row = i; // ����
			int cel = sum / row; // ����

			if (row > cel)
				continue; // ���ΰ� �� ��� continue

			if ((row - 2) * (cel - 2) == yellow) { // yellow ���� ���� (���̰� 3 �̻�)
				answer[0] = cel;
				answer[1] = row;
				break;
			}
		}

		return answer;
	}
}

public class P42842 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Solution {
	public int solution(String s) {
		int answer = 1; // �и��� ���ڿ��� ����
		int num = 1; // num�� ������ Ƚ���� �������� ��츦 ã��
		char c = s.charAt(0); // ù ����
		for (int i = 1; i < s.length(); i++) { // �ܾ� ���̸�ŭ �ݺ�
			if (num == 0) { // Ƚ���� ������ ��
				answer++;
				c = s.charAt(i); // c�� ���Ӱ� ����
			}

			if (c == s.charAt(i)) { // i��° ���ڰ� c�� ���ٸ�
				num++;
			} else
				num--;
		}
		return answer;
	}
}

public class P140108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

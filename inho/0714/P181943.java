class Solution {
	public String solution(String my_string, String overwrite_string, int s) {
		StringBuilder result = new StringBuilder(my_string); // ��Ʈ�������� ���� ����
		String answer = "";
		for (int i = 0; i < overwrite_string.length(); i++) {
			result.setCharAt(s + i, overwrite_string.charAt(i)); // ���� ��ȯ
		}
		answer = result.toString();
		return answer;
	}
}

public class P181943 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

import java.util.Arrays;

class Solution {
	public int solution(int[] people, int limit) {
		int answer = 0;
		// �ִ� 2�� Ż �� �ִ�. ok
		Arrays.sort(people);
		int people_number = people.length;
		int num = 0; // - �ε��� �� �Ƿ��� ���� ����.
		int j = -1; // ���� �������� Ƚ���� �ٿ��� �ϴµ� i���� �����̸� for�� �ȿ��� i�� �� ���� ��� �ϳ� ����.
		for (int i = 0; i < people.length; i++) { // ��� ����ŭ
			j++;
			if (people[j + num] + people[people_number - 1] > limit) { // �ּҰ�+�ִ밪�� limit���� ũ�� �ִ밪 ȥ�� ����.
				num--; // �ּҰ��� �״�� �ΰ� �ٽ� ��.
				people_number--; // �ִ밪 ������.
				answer++; // �� ����Ʈ �߰�.
			} else {// �ּҰ�+�ִ밪�� limit���� ������ ���� ����.
				i++; // for�� Ƚ�� ���̱�
				people_number--; // �ִ밪�̶� �ּҰ� ���� ������.
				answer++; // �� ����Ʈ �߰�.
			}

		}
		return answer;
	}
}
// 50 50 70 80

public class P42885 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

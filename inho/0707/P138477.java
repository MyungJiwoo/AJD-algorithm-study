import java.util.Arrays;
import java.util.Collections;

class Solution {
	public int[] solution(int k, int[] score) {
		int[] answer = new int[score.length]; // return ��

		for (int i = 0; i < score.length; i++) { // socre�� ���̸�ŭ �ݺ�
			Integer[] array = new Integer[i + 1]; // �ű� �迭 ����. Collections �޼ҵ带 ���� Integer�� ����.
			for (int j = 0; j <= i; j++) { // ���� i�� ũ�⸸ŭ �ݺ�
				array[j] = score[j]; // array�迭�� �ű��
			}
			Arrays.sort(array, Collections.reverseOrder()); // ��������
			if (i < k) {
				answer[i] = array[array.length - 1]; // ������ ��
			} else {
				answer[i] = array[k - 1]; // k��° ��
			}
		}

		return answer;
	}
}

public class P138477 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

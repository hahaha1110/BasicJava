package chapter29;

import java.util.Arrays;

public class MyStream {
	public static void main(String[] args) {
		int[] ar = {1,2,3,4,5};
		int sum = Arrays.stream(ar)				// ��Ʈ�� ����
						.filter(n -> n%2 == 1)	// filter��� (Ȧ����)
						.sum();					// sum�� ������� ��� ��ȯ
		System.out.println(sum);
	}
}

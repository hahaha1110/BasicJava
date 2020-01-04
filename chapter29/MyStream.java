package chapter29;

import java.util.Arrays;
import java.util.List;

public class MyStream {
	public static void main(String[] args) {
		int[] ar = {1,2,3,4,5};
		
		// �迭�� ��Ʈ���� �����ϴ� ���
		int sum = Arrays.stream(ar)				// ��Ʈ�� ����
						.filter(n -> n%2 == 1)	// filter��� (Ȧ����)
						.sum();					// sum�� ������� ��� ��ȯ
		System.out.println(sum);
		
		
		String[] names = {"ī��ī���޴�", "�ּ���", "�ֿ���"};
		Arrays.stream(names) // ��Ʈ�� ����
				.forEach(s -> System.out.println(s));
		
		// �÷����� ��Ʈ���� �����ϴ� ���
		List<String> list = Arrays.asList("�޴�ī��", "�ּ���", "�ֿ���");
		list.stream().forEach(s -> System.out.println(s));
	}
}

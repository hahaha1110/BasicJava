package chapter20;

import java.util.Arrays;

public class CopyOfArrys {
	public static void main(String[] args) {
		String[] arOrg = {"������", "������", "������", "������", "������", "���¿�"};
		
		// �迭 ��ü�� ����
		String[] arCpy1 = Arrays.copyOf(arOrg, arOrg.length);
		
		// ������ ������ ����(����° ������ ����)
		String[] arCpy2 = Arrays.copyOf(arOrg, 3);
		
		// ������ ~ ������ ����(3,4 �� ����(�ε��� 0���� ����))
		String[] arCpy3 = Arrays.copyOfRange(arOrg, 3, 5); //�����ؾ� �� �� 5���� �����ϴ°� �ƴ϶� 5�������� ����!
		
		for (String d : arCpy1) {
			System.out.print(d + "\t");
		}
		System.out.println();
		
		for (String d : arCpy2) {
			System.out.print(d + "\t");
		}
		System.out.println();
		
		for (String d : arCpy3) {
			System.out.print(d + "\t");
		}
		System.out.println();
	}
}

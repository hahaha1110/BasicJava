package chapter20;

import java.util.StringTokenizer;

public class TokenizeString {
	public static void main(String[] args) {
		// �Ѱ��� ������ ����
		StringTokenizer st1 = new StringTokenizer("�������񢽱�����", "��");
		
		while (st1.hasMoreTokens()) {
			System.out.print(st1.nextToken() + ' ');
		}
		System.out.println();
		// �������� ������ ����
		StringTokenizer st2 = new StringTokenizer("12 + 36 - 8 / 2 = 44","+-/= ");
		
		while (st2.hasMoreTokens()) {
			System.out.print(st2.nextToken() + ' ');
		}
		System.out.println();
	}
}

package chapter20;

import java.math.BigInteger;

/**
 * Long �����ε� ǥ���� �� ���� ���� ǥ���ؾ� �� ��
 * **/
public class SoBigInteger {
	public static void main(String[] args) {
		// long������ ǥ�� ������ ���� ũ�� ���
		System.out.println("�ִ� ���� : "+Long.MAX_VALUE);
		System.out.println("�ּ� ���� : "+Long.MIN_VALUE);
		System.out.println();
		
		// �ſ� ū ���� BingInteger �ν��Ͻ��� ǥ��
		BigInteger big1 = new BigInteger("19223372036854775807");
		BigInteger big2 = new BigInteger("-19223372036854775808");
		
		// BigInteger ��� ����
		BigInteger r1 = big1.add(big2);
		System.out.println("������� : " + r1);
	}
}

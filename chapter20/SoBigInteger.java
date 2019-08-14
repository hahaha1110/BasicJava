package chapter20;

import java.math.BigInteger;

/**
 * Long �����ε� ǥ���� �� ���� ���� ǥ���ؾ� �� ��
 * **/
public class SoBigInteger {
	public static void main(String[] args) {
		// long������ ǥ�� ������ ���� ũ�� ���
		System.out.println("�ִ� ���� : "+Long.MAX_VALUE); // Long������ ǥ���� �� �ִ� �ִ�
		System.out.println("�ּ� ���� : "+Long.MIN_VALUE); // Long������ ǥ���� �� �ִ� �ּڰ�
		System.out.println();
		
		// �ſ� ū ���� BingInteger �ν��Ͻ��� ǥ��
		BigInteger big1 = new BigInteger("19223372036854775807");
		BigInteger big2 = new BigInteger("-19223372036854775808");
		
		// BigInteger ��� ����
		BigInteger r1 = big1.add(big2);
		System.out.println("������� : " + r1);
		
		// BigInteger ��� ����
		BigInteger r2 = big1.subtract(big2);
		System.out.println("������� : " + r2);
		
		// BigInteger ��� ����
		BigInteger r3 = big1.multiply(big2);
		System.out.println("���� ��� : "+r3);
		
		// BigInteger ��� �������� ��
		BigInteger r4 = big1.divide(big2);
		System.out.println("�������� �� : "+r4);
		
		// BigInteger ��� �������� ������
		BigInteger r5 = big1.remainder(big2);
		System.out.println("�������� ������ : "+r5);
		
		// �ν��Ͻ��� ����� ���� int�� ������ ��ȯ
		int num = r1.intValueExact();
		System.out.println("From BigInteger : "+num);
	}
}

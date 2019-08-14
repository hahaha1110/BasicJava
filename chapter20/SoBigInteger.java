package chapter20;

import java.math.BigInteger;

/**
 * Long 형으로도 표현할 수 없는 수를 표현해야 할 때
 * **/
public class SoBigInteger {
	public static void main(String[] args) {
		// long형으로 표현 가능한 값의 크기 출력
		System.out.println("최대 정수 : "+Long.MAX_VALUE);
		System.out.println("최소 정수 : "+Long.MIN_VALUE);
		System.out.println();
		
		// 매우 큰 수를 BingInteger 인스턴스로 표현
		BigInteger big1 = new BigInteger("19223372036854775807");
		BigInteger big2 = new BigInteger("-19223372036854775808");
		
		// BigInteger 기반 덧셈
		BigInteger r1 = big1.add(big2);
		System.out.println("덧셈결과 : " + r1);
	}
}

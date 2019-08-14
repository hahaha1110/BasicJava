package chapter20;

import java.math.BigInteger;

/**
 * Long 형으로도 표현할 수 없는 수를 표현해야 할 때
 * **/
public class SoBigInteger {
	public static void main(String[] args) {
		// long형으로 표현 가능한 값의 크기 출력
		System.out.println("최대 정수 : "+Long.MAX_VALUE); // Long형으로 표현할 수 있는 최댓값
		System.out.println("최소 정수 : "+Long.MIN_VALUE); // Long형으로 표현할 수 있는 최솟값
		System.out.println();
		
		// 매우 큰 수를 BingInteger 인스턴스로 표현
		BigInteger big1 = new BigInteger("19223372036854775807");
		BigInteger big2 = new BigInteger("-19223372036854775808");
		
		// BigInteger 기반 덧셈
		BigInteger r1 = big1.add(big2);
		System.out.println("덧셈결과 : " + r1);
		
		// BigInteger 기반 뺄셈
		BigInteger r2 = big1.subtract(big2);
		System.out.println("뺄셈결과 : " + r2);
		
		// BigInteger 기반 곱셈
		BigInteger r3 = big1.multiply(big2);
		System.out.println("곱셈 결과 : "+r3);
		
		// BigInteger 기반 나눗셈의 몫
		BigInteger r4 = big1.divide(big2);
		System.out.println("나눗셈의 몫 : "+r4);
		
		// BigInteger 기반 나눗셈의 나머지
		BigInteger r5 = big1.remainder(big2);
		System.out.println("나눗셈의 나머지 : "+r5);
		
		// 인스턴스에 저장된 값을 int형 정수로 반환
		int num = r1.intValueExact();
		System.out.println("From BigInteger : "+num);
	}
}

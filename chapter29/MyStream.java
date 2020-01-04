package chapter29;

import java.util.Arrays;

public class MyStream {
	public static void main(String[] args) {
		int[] ar = {1,2,3,4,5};
		int sum = Arrays.stream(ar)				// 스트림 생성
						.filter(n -> n%2 == 1)	// filter통과 (홀수만)
						.sum();					// sum을 통과시켜 결과 반환
		System.out.println(sum);
	}
}

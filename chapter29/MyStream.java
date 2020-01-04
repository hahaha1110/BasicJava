package chapter29;

import java.util.Arrays;
import java.util.List;

public class MyStream {
	public static void main(String[] args) {
		int[] ar = {1,2,3,4,5};
		
		// 배열의 스트림을 생성하는 방법
		int sum = Arrays.stream(ar)				// 스트림 생성
						.filter(n -> n%2 == 1)	// filter통과 (홀수만)
						.sum();					// sum을 통과시켜 결과 반환
		System.out.println(sum);
		
		
		String[] names = {"카이카말휴닝", "최수빈", "최연준"};
		Arrays.stream(names) // 스트림 생성
				.forEach(s -> System.out.println(s));
		
		// 컬렉션의 스트림을 생성하는 방법
		List<String> list = Arrays.asList("휴닝카이", "최수빈", "최연준");
		list.stream().forEach(s -> System.out.println(s));
	}
}

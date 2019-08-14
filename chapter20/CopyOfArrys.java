package chapter20;

import java.util.Arrays;

public class CopyOfArrys {
	public static void main(String[] args) {
		String[] arOrg = {"전정국", "김태형", "남도현", "구정모", "강민희", "조승연"};
		
		// 배열 전체를 복사
		String[] arCpy1 = Arrays.copyOf(arOrg, arOrg.length);
		
		// 남도현 까지만 복사(세번째 까지만 복사)
		String[] arCpy2 = Arrays.copyOf(arOrg, 3);
		
		// 구정모 ~ 강민희만 복사(3,4 만 복사(인덱스 0부터 시작))
		String[] arCpy3 = Arrays.copyOfRange(arOrg, 3, 5); //주의해야 할 점 5까지 복사하는게 아니라 5이전까지 복사!
		
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

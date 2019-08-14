package chapter20;

import java.util.StringTokenizer;

public class TokenizeString {
	public static void main(String[] args) {
		// 한개의 구분자 정보
		StringTokenizer st1 = new StringTokenizer("♡강민희♡구정모♡", "♡");
		
		while (st1.hasMoreTokens()) {
			System.out.print(st1.nextToken() + ' ');
		}
		System.out.println();
		// 여러개의 구분자 정보
		StringTokenizer st2 = new StringTokenizer("12 + 36 - 8 / 2 = 44","+-/= ");
		
		while (st2.hasMoreTokens()) {
			System.out.print(st2.nextToken() + ' ');
		}
		System.out.println();
	}
}

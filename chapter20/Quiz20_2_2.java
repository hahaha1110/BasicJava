package chapter20;

import java.util.Arrays;

public class Quiz20_2_2 {
	public static void main(String[] args) {
		personQ2[] ar = new personQ2[3];
		ar[0] = new personQ2("남도현쨔응", 16);
		ar[1] = new personQ2("전정국ㅎ", 23);
		ar[2] = new personQ2("박지성", 18);
		
		Arrays.sort(ar);
		for (personQ2 p : ar) {
			System.out.println(p);
		}
	}
}

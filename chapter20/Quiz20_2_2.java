package chapter20;

import java.util.Arrays;

public class Quiz20_2_2 {
	public static void main(String[] args) {
		personQ2[] ar = new personQ2[3];
		ar[0] = new personQ2("������¹��", 16);
		ar[1] = new personQ2("��������", 23);
		ar[2] = new personQ2("������", 18);
		
		Arrays.sort(ar);
		for (personQ2 p : ar) {
			System.out.println(p);
		}
	}
}

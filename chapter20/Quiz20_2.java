package chapter20;

import java.util.Arrays;

public class Quiz20_2 {
	public static void main(String[] args) {
		PersonQ[] ar = new PersonQ[3];
		ar[0] = new PersonQ("������", 16);
		ar[1] = new PersonQ("������", 23);
		ar[2] = new PersonQ("������", 18);
		
		Arrays.sort(ar);
		for (PersonQ p : ar) {
			System.out.println(p);
		}
	}
}

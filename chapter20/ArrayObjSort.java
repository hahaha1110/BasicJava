package chapter20;

import java.util.Arrays;

public class ArrayObjSort {

	public static void main(String[] args) {
		Person[] ar = new Person[3];
		ar[0] = new Person("������", 16);
		ar[1] = new Person("������", 23);
		ar[2] = new Person("������", 18);
		
		Arrays.sort(ar);
		for (Person p : ar) {
			System.out.println(p);
		}
	}

}

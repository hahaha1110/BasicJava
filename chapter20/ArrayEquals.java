package chapter20;

import java.util.Arrays;

public class ArrayEquals {
	public static void main(String[] args) {
		String[] arOrg = {"������", "������", "������", "������", "������", "���¿�"};
		String[] arOrg2 = Arrays.copyOf(arOrg, arOrg.length);
		
		System.out.println(Arrays.equals(arOrg, arOrg2));
	}
}

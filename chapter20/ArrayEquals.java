package chapter20;

import java.util.Arrays;

public class ArrayEquals {
	public static void main(String[] args) {
		String[] arOrg = {"전정국", "김태형", "남도현", "구정모", "강민희", "조승연"};
		String[] arOrg2 = Arrays.copyOf(arOrg, arOrg.length);
		
		System.out.println(Arrays.equals(arOrg, arOrg2));
	}
}

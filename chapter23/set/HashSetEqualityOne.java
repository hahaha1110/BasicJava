package chapter23.set;

import java.util.HashSet;

public class HashSetEqualityOne {
	public static void main(String[] args) {
		HashSet<Num> set = new HashSet<>();
		set.add(new Num(7799));
		set.add(new Num(9955));
		set.add(new Num(7799));
		System.out.println("�ν��Ͻ� �� : " + set.size());
		
		for (Num num : set) {
			System.out.print(num.toString() + "\t");
		}
		System.out.println();
	}
}

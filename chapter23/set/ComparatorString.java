package chapter23.set;

import java.util.Comparator;
import java.util.TreeSet;

class StringComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return o1.length() - o2.length();
	}
}

public class ComparatorString {
	public static void main(String[] args) {
		TreeSet<String> tree = new TreeSet<>(new StringComparator());
		tree.add("Box");
		tree.add("Rabbit");
		tree.add("Robot");
		
		for (String s : tree) {
			System.out.print(s + "\t");
		}
		System.out.println();
	}
}

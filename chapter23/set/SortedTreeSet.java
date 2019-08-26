package chapter23.set;

import java.util.TreeSet;

public class SortedTreeSet {
	public static void main(String[] args) {
		TreeSet<Integer> tree = new TreeSet<>();
		tree.add(3);
		tree.add(1);
		tree.add(2);
		tree.add(4);
		
		System.out.println("�ν��Ͻ� �� : " + tree.size());
		
		// for-each ���� ���� �ݺ�
		for (Integer n : tree) {
			System.out.print(n.toString() + "\t");
		}
		System.out.println();
	}
}

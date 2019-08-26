package chapter23.map;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

class AgeComparator implements Comparator<Integer>{
	public int compare(Integer n1, Integer n2) {
		return n2-n1;
	}
}

public class ComparatorTreeMap {
	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<>(new AgeComparator());
		map.put(45, "Brown");
		map.put(37, "James");
		map.put(23, "Martin");
		
		// key�� ��� �ִ� �÷��� �ν��Ͻ� ����
		Set<Integer> ks = map.keySet();
		
		// ��ü key ��� (for-each�� ���)
		for (Integer n : ks) {
			System.out.print(n + "\t");
		}
		System.out.println();
		
		// ��ü value ���
		for (Integer n : ks) {
			System.out.print(map.get(n) + "\t");
		}
		System.out.println();
		
		// ��ü value ��� (�ݺ��� ���)
		for(Iterator<Integer> itr = ks.iterator() ; itr.hasNext() ;)
			System.out.print(map.get(itr.next()) + "\t");
		
		System.out.println();
	}
}

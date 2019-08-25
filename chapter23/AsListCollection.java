package chapter23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class AsListCollection {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Toy", "Box", "Robot", "Box");
		list = new ArrayList<>(list);
		
		// for�� ����� �ݺ��� ȹ��� ������ ����
		for (Iterator<String> itr = list.iterator() ; itr.hasNext() ;) {
			System.out.print(itr.next() + '\t');
		}
		System.out.println();
		
		// "Box"�� ��� �����ϱ� ���� �ݺ���
		for (Iterator<String> itr = list.iterator() ; itr.hasNext() ;) {
			if(itr.next().equals("Box"))
				itr.remove();
		}
		System.out.println();
		
		for (Iterator<String> itr = list.iterator() ; itr.hasNext() ;) {
			System.out.print(itr.next() + '\t');
		}
		System.out.println();
	}
}

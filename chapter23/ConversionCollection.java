package chapter23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * ArraysList<E> �� ����ϴٰ� 
 * ���� ����Ʈ �ڷᱸ���� Ư���� �ʿ��ؼ� 
 * LinkedList<E>�� �ٲ��ִ� ����
 * **/
public class ConversionCollection {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Toy", "Box", "Robot", "Box");
		list = new ArrayList<>(list);
		
		// ArraysList<E>�� ��ȯ
		for (Iterator<String> itr = list.iterator() ; itr.hasNext() ;) {
			System.out.print(itr.next() + "\t");
		}
		System.out.println();
		
		// ArraysList<E> �ν��Ͻ� ������� LinkedList<E> �ν��Ͻ� ����
		list = new LinkedList<>(list);
		
		// LinkedList<E>�� ��ȯ
		for (Iterator<String> itr = list.iterator() ; itr.hasNext() ;) {
			System.out.print(itr.next() + '\t');
		}
		System.out.println();
	}
}

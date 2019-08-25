package chapter23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * ArraysList<E> 를 사용하다가 
 * 연결 리스트 자료구조의 특성이 필요해서 
 * LinkedList<E>로 바꿔주는 예제
 * **/
public class ConversionCollection {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Toy", "Box", "Robot", "Box");
		list = new ArrayList<>(list);
		
		// ArraysList<E>의 순환
		for (Iterator<String> itr = list.iterator() ; itr.hasNext() ;) {
			System.out.print(itr.next() + "\t");
		}
		System.out.println();
		
		// ArraysList<E> 인스턴스 기반으로 LinkedList<E> 인스턴스 생성
		list = new LinkedList<>(list);
		
		// LinkedList<E>의 순환
		for (Iterator<String> itr = list.iterator() ; itr.hasNext() ;) {
			System.out.print(itr.next() + '\t');
		}
		System.out.println();
	}
}

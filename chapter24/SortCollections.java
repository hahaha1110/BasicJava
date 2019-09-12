package chapter24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortCollections {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("남도현", "강민희", "구정모", "전정국");
		list = new ArrayList<>(list);
		
		// 정렬 이전 출력
		for(Iterator<String> itr = list.iterator();itr.hasNext();) {
			System.out.print(itr.next() + "\t");
		}
		System.out.println();
		
		// 정렬
		Collections.sort(list);
		
		// 정렬 이후 출력
		for(Iterator<String> itr = list.iterator();itr.hasNext();) {
			System.out.print(itr.next() + "\t");
		}
		System.out.println();
	}
}

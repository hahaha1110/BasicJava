package chapter23;

import java.util.LinkedList;
import java.util.List;

public class EnhanceForCollection {
	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		
		// 인스턴스 저장
		list.add("도현");
		list.add("민희");
		list.add("정국");
		
		// 첫 번째 인스턴스 삭제
		list.remove(0);
		
		// 전체 인스턴스 참조
		for (String s : list) {
			System.out.print(s + '\t');
		}
		System.out.println();
	}
}

package chapter23;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorCollection {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		list.add("정국");
		list.add("민희");
		list.add("도현");
		list.add("정모");
		
		// 반복자 획득
		Iterator<String> itr = list.iterator();
		
		// 반복자를 이용한 순차적 참조
		while (itr.hasNext()) {// next메소드 호출 시 참조값 반환 가능 여부 확인
			System.out.print(itr.next() + '\t'); // 다음 인스턴스 참조값을 반환
		}
		System.out.println();
		
		itr = list.iterator(); // 반복자를 다시 첫번째 인스턴스를 가리키도록 재획득(가리키는 위치 되돌리는 방법이 없음)
		
		// 모든 "정모" 삭제
		while (itr.hasNext()) {
			if(itr.next().equals("정모")) {
				itr.remove();// next 메소드 호출을 통해 반환했던 인스턴스 삭제
			}
		}
		
		itr = list.iterator(); // 반복자를 다시 첫번째 인스턴스를 가리키도록 재획득
		
		// 삭제 후 결과 확인
		while (itr.hasNext()) {
			System.out.print(itr.next() + '\t');
		}
		System.out.println();
	}

}

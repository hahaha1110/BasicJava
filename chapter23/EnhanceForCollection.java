package chapter23;

import java.util.LinkedList;
import java.util.List;

public class EnhanceForCollection {
	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		
		// �ν��Ͻ� ����
		list.add("����");
		list.add("����");
		list.add("����");
		
		// ù ��° �ν��Ͻ� ����
		list.remove(0);
		
		// ��ü �ν��Ͻ� ����
		for (String s : list) {
			System.out.print(s + '\t');
		}
		System.out.println();
	}
}

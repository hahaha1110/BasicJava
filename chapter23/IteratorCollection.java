package chapter23;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorCollection {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("����");
		
		// �ݺ��� ȹ��
		Iterator<String> itr = list.iterator();
		
		// �ݺ��ڸ� �̿��� ������ ����
		while (itr.hasNext()) {// next�޼ҵ� ȣ�� �� ������ ��ȯ ���� ���� Ȯ��
			System.out.print(itr.next() + '\t'); // ���� �ν��Ͻ� �������� ��ȯ
		}
		System.out.println();
		
		itr = list.iterator(); // �ݺ��ڸ� �ٽ� ù��° �ν��Ͻ��� ����Ű���� ��ȹ��(����Ű�� ��ġ �ǵ����� ����� ����)
		
		// ��� "����" ����
		while (itr.hasNext()) {
			if(itr.next().equals("����")) {
				itr.remove();// next �޼ҵ� ȣ���� ���� ��ȯ�ߴ� �ν��Ͻ� ����
			}
		}
		
		itr = list.iterator(); // �ݺ��ڸ� �ٽ� ù��° �ν��Ͻ��� ����Ű���� ��ȹ��
		
		// ���� �� ��� Ȯ��
		while (itr.hasNext()) {
			System.out.print(itr.next() + '\t');
		}
		System.out.println();
	}

}

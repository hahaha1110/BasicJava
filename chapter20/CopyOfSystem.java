package chapter20;

public class CopyOfSystem {

	public static void main(String[] args) {
		String[] org = {"������", "������", "������", "������", "������", "���¿�"};
		String[] cpy = new String[3];
		
		// �迭 org�� �ε��� 1���� �迭 cpy�ε��� 0���� �� ���� ��� ����
		System.arraycopy(org, 1, cpy, 0, 3);
		
		for (String s : cpy) {
			System.out.print(s + "\t");
		}
		System.out.println();
	}
}

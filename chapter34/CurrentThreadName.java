package chapter34;

public class CurrentThreadName {

	public static void main(String[] args) {
		Thread ct = Thread.currentThread();
		String name = ct.getName(); // �������� �̸��� ��ȯ
		System.out.println(name);
	}

}

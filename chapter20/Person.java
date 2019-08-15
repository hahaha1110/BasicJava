package chapter20;

public class Person implements Comparable{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Object o) {
		// ���̰� � �ν��Ͻ��� ũ�⸦ ���������� ����
		/**
		 * ���ڷ� ���޵� o�� �۴ٸ� ���� ���� ��ȯ
		 * ���ڷ� ���޵� o�� ũ�ٸ� ���� ���� ��ȯ
		 * ���ڷ� ���޵� o�� ���ٸ� 0�� ��ȯ
		 * **/
		Person p = (Person)o;
		return this.age - p.age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	
	
}

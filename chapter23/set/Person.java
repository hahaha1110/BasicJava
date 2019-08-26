package chapter23.set;

public class Person implements Comparable<Person>{
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + " : " + age;
	}
	
	@Override
	public int compareTo(Person p) {
		// ���̰� ���� ����� �տ� ������
		// ���� p�� ������ ��, ũ�� �� ������ 0�� ��ȯ
		return this.age - p.age;
	}
	
}

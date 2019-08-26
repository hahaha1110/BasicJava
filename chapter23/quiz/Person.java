package chapter23.quiz;

import java.util.Objects;

public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + "(" + age + "��)";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}
	
	@Override
	public boolean equals(Object obj) {
		// �Ѵ� ������ true ��ȯ �ƴϸ� false ��ȯ
		return (name.equals(((Person)obj).name) && age == ((Person)obj).age) ? true : false;
	}
	
}

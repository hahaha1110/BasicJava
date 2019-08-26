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
		return name + "(" + age + "세)";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}
	
	@Override
	public boolean equals(Object obj) {
		// 둘다 같으면 true 반환 아니면 false 반환
		return (name.equals(((Person)obj).name) && age == ((Person)obj).age) ? true : false;
	}
	
}

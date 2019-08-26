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
		// 나이가 적은 사람이 앞에 오도록
		// 인자 p가 작으면 양, 크면 음 같으면 0을 반환
		return this.age - p.age;
	}
	
}

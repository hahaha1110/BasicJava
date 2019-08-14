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
		// 나이가 어린 인스턴스의 크기를 작은것으로 설정
		/**
		 * 인자로 전달된 o가 작다면 양의 정수 반환
		 * 인자로 전달된 o가 크다면 음의 정수 반환
		 * 인자로 전달된 o와 같다면 0을 반환
		 * **/
		Person p = (Person)o;
		if(this.age > p.age)
			return 1;
		else if(this.age < p.age)
			return -1;
		else
			return 0;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	
	
}

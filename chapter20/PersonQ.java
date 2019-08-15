package chapter20;

public class PersonQ implements Comparable{
	private String name;
	private int age;
	
	public PersonQ(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Object o) {
		PersonQ p = (PersonQ)o;
		return p.age - this.age;
	}
	
	@Override
	public String toString() {
		return "PersonQ [name=" + name + ", age=" + age + "]";
	}
}

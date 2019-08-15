package chapter20;

public class personQ2 implements Comparable{
	private String name;
	private int age;
	
	public personQ2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "PersonQ2 [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Object o) {
		return this.name.length() - ((personQ2)o).name.length();
	}
}

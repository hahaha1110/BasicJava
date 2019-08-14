package chapter19;

public class Person {
	String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	@Override
	protected void finalize() throws Throwable{
		super.finalize(); // 상위 클래스의 finalize메소드 호출
		System.out.println("destroyed : " + name);
	}
}

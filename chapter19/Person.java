package chapter19;

public class Person {
	String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	@Override
	protected void finalize() throws Throwable{
		super.finalize(); // ���� Ŭ������ finalize�޼ҵ� ȣ��
		System.out.println("destroyed : " + name);
	}
}

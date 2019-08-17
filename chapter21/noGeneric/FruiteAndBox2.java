package chapter21.noGeneric;

public class FruiteAndBox2 {
	public static void main(String[] args) {
		Box aBox = new Box();
		Box oBox = new Box();
		
		aBox.set(new Apple2());// ���ڿ� ����� ��´�
		oBox.set(new Orange2());// ���ڿ� �������� ��´�
		
		Apple2 ap  = (Apple2)aBox.get();// ���ڿ��� ����� ������
		Orange2 og = (Orange2)oBox.get();// ���ڿ��� �������� ������
		
		System.out.println(ap);
		System.out.println(og);
		
	}
}

// ��� Ŭ����
class Apple2{ 
	public String toString() {
		return "I am an apple.";
	}
}

// ������ Ŭ����
class Orange2{ 
	public String toString() {
		return "I am an orange.";
	}
}

// ���� �ڽ�
class Box{
	private Object ob;

	public Object get() {
		return ob;
	}

	public void set(Object o) {
		this.ob = o;
	}
	
}
package chapter21.generic;

public class FruitAndBox {
	public static void main(String[] args) {
		Box<Apple> aBox = new Box<Apple>();
		Box<Orange> oBox = new Box<Orange>();
		
		aBox.set(new Apple());// ��� ���ڿ� ����� ��´�
		oBox.set(new Orange());// ������ ���ڿ� �������� ��´�
		
		Apple ap = aBox.get();// ��� ���ڿ��� ����� ������
		Orange og = oBox.get();// ������ ���ڿ��� �������� ������
		
		System.out.println(ap);
		System.out.println(og);
		
	}
}

// ��� Ŭ����
class Apple{ 
	public String toString() {
		return "I am an apple.";
	}
}

// ������ Ŭ����
class Orange{ 
	public String toString() {
		return "I am an orange.";
	}
}

// ���׸� �ڽ�
class Box<T>{
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	
	public T get() {
		return ob;
	}
}
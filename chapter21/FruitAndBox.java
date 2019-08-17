package chapter21;

public class FruitAndBox {
	public static void main(String[] args) {
		AppleBox aBox = new AppleBox();
		OrangeBox oBox = new OrangeBox();
		
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

// ��� �ڽ�
class AppleBox{
	private Apple ap;
	
	public void set(Apple a) {
		ap = a;
	}
	
	public Apple get() {
		return ap;
	}
}

//������ �ڽ�
class OrangeBox{
	private Orange or;
	
	public void set(Orange o) {
		or = o;
	}
	
	public Orange get() {
		return or;
	}
}
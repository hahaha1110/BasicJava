package chapter22.wildCard;

class Box<T>{
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	
	public T get() {
		return ob;
	}
	
	@Override
	public String toString(){
		return ob.toString();
	}
}

class Unboxer{
	public static <T> T openBox(Box<T> box) {
		return box.get();
	}
	
	// ���� ���� ���빰�� ����ϴ� ����� ���׸� �޼ҵ�
	public static void peekBox(Box<?> box) { //���ϵ�ī�� ���
		System.out.println(box);
	}
}

public class WildcardUnboxer2 {
	public static void main(String[] args) {
		Box<String> box = new Box<>();
		box.set("������ �Ϳ���");
		Unboxer.peekBox(box);// ���� ���� ���빰�� Ȯ���غ���.
	}
}

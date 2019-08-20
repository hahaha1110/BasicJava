package chapter22.noWildCard;

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
	public static <T> void peekBox(Box<T> box) {
		System.out.println(box);
	}
}

public class WildcardUnboxer {
	public static void main(String[] args) {
		Box<String> box = new Box<>();
		box.set("������ �Ϳ���");
		Unboxer.peekBox(box);// ���� ���� ���빰�� Ȯ���غ���.
	}
}

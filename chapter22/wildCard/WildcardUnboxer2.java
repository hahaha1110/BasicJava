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
	
	// 상자 안의 내용물을 출력하는 기능의 제네릭 메소드
	public static void peekBox(Box<?> box) { //와일드카드 사용
		System.out.println(box);
	}
}

public class WildcardUnboxer2 {
	public static void main(String[] args) {
		Box<String> box = new Box<>();
		box.set("남도현 귀여워");
		Unboxer.peekBox(box);// 상자 안의 내용물을 확인해본다.
	}
}

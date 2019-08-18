package chapter21.generic;

class BoxFactory{
	
	// 제네릭 메소드
	public static <T> Box<T> makeBox(T o){
		Box<T> box = new Box();// 상자를 생성하고
		box.set(o);// 전달된 인스턴스를 상자에 담아서
		return box;// 반환
	}
}

public class GenericMethodBoxMaker {
	public static void main(String[] args) {
		Box<String> sBox = BoxFactory.makeBox("Sweet");
		System.out.println(sBox.get());
		System.out.println(BoxFactory.makeBox(3).get());
	}
}

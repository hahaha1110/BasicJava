package chapter21.generic;

class BoxFactory{
	
	// ���׸� �޼ҵ�
	public static <T> Box<T> makeBox(T o){
		Box<T> box = new Box();// ���ڸ� �����ϰ�
		box.set(o);// ���޵� �ν��Ͻ��� ���ڿ� ��Ƽ�
		return box;// ��ȯ
	}
}

public class GenericMethodBoxMaker {
	public static void main(String[] args) {
		Box<String> sBox = BoxFactory.makeBox("Sweet");
		System.out.println(sBox.get());
		System.out.println(BoxFactory.makeBox(3).get());
	}
}

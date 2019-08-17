package chapter21.noGeneric;

public class FruiteAndBox2 {
	public static void main(String[] args) {
		Box aBox = new Box();
		Box oBox = new Box();
		
		aBox.set(new Apple2());// 상자에 사과를 담는다
		oBox.set(new Orange2());// 상자에 오렌지를 담는다
		
		Apple2 ap  = (Apple2)aBox.get();// 상자에서 사과를 꺼낸다
		Orange2 og = (Orange2)oBox.get();// 상자에서 오렌지를 꺼낸다
		
		System.out.println(ap);
		System.out.println(og);
		
	}
}

// 사과 클래스
class Apple2{ 
	public String toString() {
		return "I am an apple.";
	}
}

// 오렌지 클래스
class Orange2{ 
	public String toString() {
		return "I am an orange.";
	}
}

// 만능 박스
class Box{
	private Object ob;

	public Object get() {
		return ob;
	}

	public void set(Object o) {
		this.ob = o;
	}
	
}
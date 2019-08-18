package chapter21.generic;

public class FruitAndBox {
	public static void main(String[] args) {
		Box<Apple> aBox = new Box<Apple>();
		Box<Orange> oBox = new Box<Orange>();
		
		aBox.set(new Apple());// 사과 상자에 사과를 담는다
		oBox.set(new Orange());// 오렌지 상자에 오렌지를 담는다
		
		Apple ap = aBox.get();// 사과 상자에서 사과를 꺼낸다
		Orange og = oBox.get();// 오렌지 상자에서 오렌지를 꺼낸다
		
		System.out.println(ap);
		System.out.println(og);
		
	}
}

// 사과 클래스
class Apple{ 
	public String toString() {
		return "I am an apple.";
	}
}

// 오렌지 클래스
class Orange{ 
	public String toString() {
		return "I am an orange.";
	}
}

// 제네릭 박스
class Box<T>{
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	
	public T get() {
		return ob;
	}
}
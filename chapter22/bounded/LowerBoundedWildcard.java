package chapter22.bounded;

class Unboxer2{
	public static void peekBox(Box<? super Integer> box) { 
		System.out.println(box);
	}
}

public class LowerBoundedWildcard {
	public static void main(String[] args) {
		Box<Integer> iBox = new Box<>();
		iBox.set(1234);
		
		Box<Number> nBox = new Box<>();
		nBox.set(new Integer(99555));
		
		Box<Object> oBox = new Box<>();
		oBox.set("ggggg");
		
		Unboxer2.peekBox(iBox);
		Unboxer2.peekBox(nBox);
		Unboxer2.peekBox(oBox);
	}
}

package chapter21.generic;

public class BoxInBox {
	public static void main(String[] args) {
		Box<String> sBox = new Box<>();
		sBox.set("남도현 귀여워");
		
		Box<Box<String>> wBox = new Box<>();
		wBox.set(sBox);
		
		Box<Box<Box<String>>> zBox = new Box<>();
		zBox.set(wBox);
		
		System.out.println(zBox.get().get().get());
	}
}

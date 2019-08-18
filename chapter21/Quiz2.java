package chapter21;

class Box<T>{
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	
	public T get() {
		return ob;
	}
}

public class Quiz2 {
	public static <T extends Number> void swapBox(Box<T> box1, Box<T> box2){
		Box<T> tempBox = box1;
		box1.set(box2.get());
		box2.set(tempBox.get());
	}
	public static void main(String[] args) {
		Box<Integer> box1 = new Box();
		box1.set(99);
		Box<Integer> box2 = new Box();
		box2.set(55);
		System.out.println(box1.get()+"&"+box2.get());
		swapBox(box1, box2);
		System.out.println(box1.get()+"&"+box2.get());
	}
}

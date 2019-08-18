package chapter21;

public class Quiz {
	public static void main(String[] args) {
		DBox<String, Integer> box1 = new DBox();
		box1.set("Apple", 25);
		DBox<String, Integer> box2 = new DBox();
		box2.set("Orange", 33);
		DBox<DBox<String, Integer>, DBox<String, Integer>> ddbox = new DBox();
		ddbox.set(box1, box2);
		
		System.out.println(ddbox);
	}
}
class DBox<L,R>{
	private L left;
	private R right;
	public void set(L l, R r){
		left  = l;
		right = r;
	}
	
	@Override
	public String toString() {
		return "DBox [left=" + left + ", right=" + right + "]";
	}
	
}
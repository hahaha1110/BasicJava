package chapter22.bounded;

class Toy{
	@Override
	public String toString() {
		return "I am a Toy";
	}
}

class BoxHandler{
	public static void outBox(Box<? extends Toy> box) {// 상한제한의 목적 : Toy를 상속한 클래스들이 전달타입으로 올 수 있기 때문에 Box<Toy>만 전달된다는 사실을 보장할 수 없어서 box.set이 오류가 남!
		Toy t = box.get();
		System.out.println(t);
	}
	public static void inBox(Box<? super Toy> box, Toy n) {// 하한제한의 목적 이 메소드 안에 get을 쓰면 오류가 남
		box.set(n);
		//Toy myToy = box.get();     //여기서 오류가 남. get자체는 오류가 아니지만 반환받는 변수의 타입이 Toy라고 확정할 수 없으므로 오류가 남
	}
}

public class BoundWildCardUsage {
	public static void main(String[] args) {
		Box<Toy> box = new Box<>();
		BoxHandler.inBox(box, new Toy());
		BoxHandler.outBox(box);
	}
}

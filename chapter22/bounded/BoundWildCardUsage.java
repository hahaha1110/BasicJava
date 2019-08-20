package chapter22.bounded;

class Toy{
	@Override
	public String toString() {
		return "I am a Toy";
	}
}

class BoxHandler{
	public static void outBox(Box<? extends Toy> box) {// ���������� ���� : Toy�� ����� Ŭ�������� ����Ÿ������ �� �� �ֱ� ������ Box<Toy>�� ���޵ȴٴ� ����� ������ �� ��� box.set�� ������ ��!
		Toy t = box.get();
		System.out.println(t);
	}
	public static void inBox(Box<? super Toy> box, Toy n) {// ���������� ���� �� �޼ҵ� �ȿ� get�� ���� ������ ��
		box.set(n);
		//Toy myToy = box.get();     //���⼭ ������ ��. get��ü�� ������ �ƴ����� ��ȯ�޴� ������ Ÿ���� Toy��� Ȯ���� �� �����Ƿ� ������ ��
	}
}

public class BoundWildCardUsage {
	public static void main(String[] args) {
		Box<Toy> box = new Box<>();
		BoxHandler.inBox(box, new Toy());
		BoxHandler.outBox(box);
	}
}

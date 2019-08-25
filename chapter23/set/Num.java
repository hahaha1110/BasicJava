package chapter23.set;

public class Num {
	private int num;
	public Num(int n) {
		num = n;
	}
	
	@Override
	public String toString() {
		return String.valueOf(num);
	}
	
	@Override
	public int hashCode() {
		return num % 3;	// num �� ���� ������ �η��� ����.
	}
	
	@Override
	public boolean equals(Object obj) {
		// num ���� ������ true ��ȯ
		if(num == ((Num)obj).num)
			return true;
		else
			return false;
	}
}

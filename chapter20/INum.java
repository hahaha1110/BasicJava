package chapter20;

public class INum {
	private int num;
	public INum(int num) {
		this.num = num;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this.num == ((INum)obj).num) // �� �ν��Ͻ��� ���� ��
			return true;
		else
			return false;
	}
}

package chapter20;

public class INum {
	private int num;
	public INum(int num) {
		this.num = num;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this.num == ((INum)obj).num) // 두 인스턴스의 내용 비교
			return true;
		else
			return false;
	}
}

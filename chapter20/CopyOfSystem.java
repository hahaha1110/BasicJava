package chapter20;

public class CopyOfSystem {

	public static void main(String[] args) {
		String[] org = {"전정국", "김태형", "남도현", "구정모", "강민희", "조승연"};
		String[] cpy = new String[3];
		
		// 배열 org의 인덱스 1에서 배열 cpy인덱스 0으로 세 개의 요소 복사
		System.arraycopy(org, 1, cpy, 0, 3);
		
		for (String s : cpy) {
			System.out.print(s + "\t");
		}
		System.out.println();
	}
}

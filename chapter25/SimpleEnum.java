package chapter25;

// 열거형
enum Scale{
	DO, RE, MI, FA, SO, RA, TI // public static final 선언된 것으로 간주(인터페이스 내에 선언된 변수도 마찬가지)
}

public class SimpleEnum {
	public static void main(String[] args) {
		Scale sc = Scale.DO;
		System.out.println(sc);
		
		switch (sc) {// 기본적으로 열거형 값은 Scale.DO같이 표현하지만 case문에서는 간결하게 표현하기로 약속되어있음
		case DO:
			System.out.println("도");
			break;
		case RE:
			System.out.println("레");
			break;
		case MI:
			System.out.println("미");
			break;
		case FA:
			System.out.println("파");
			break;
		case SO:
			System.out.println("솔");
			break;
		case RA:
			System.out.println("라");
			break;
		case TI:
			System.out.println("시");
			break;
		default:
			break;
		}
	}
}

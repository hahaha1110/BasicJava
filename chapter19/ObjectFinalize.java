package chapter19;

/**
 * *접근 수준 제한자 
 * 	public : 어디서나
 *  default : 같은 패키지내에서
 *  protected : default + 상속관계에 있는 클래스에서 접근 가능
 *  private : 클래스내부에서만
**/
public class ObjectFinalize {
	
	public static void main(String[] args) {
		Person p1 = new Person("전정국");
		Person p2 = new Person("남도현");
		
		// 참조 대상을 가비지 컬렉션의 대상으로 만듦
		p1 = null;
		p2 = null;
		
		System.gc(); // 가비지 컬렉션의 수행을 요청
		System.runFinalization(); // 소멸이 보류된 인스턴스의 finalize 메소드 호출을 요청
		System.out.println("end of program");
	}
}//ObjectFinalize

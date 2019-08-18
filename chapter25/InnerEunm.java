package chapter25;

public class InnerEunm {
	public static void main(String[] args) {
		Customer cus1 = new Customer("남도현", "man");
		Customer cus2 = new Customer("안유진", "female");
		
		System.out.println(cus1);
		System.out.println(cus2);
	}
}

class Customer{
	enum Gender{ // 클래스 내에 정의된 열거형 Gender
		MALE, FEMALE
	}
	
	private String name;
	private Gender gen;
	
	Customer(String n, String g){
		name = n;
		gen = g.equals("man") ? Gender.MALE : Gender.FEMALE;
	}

	@Override
	public String toString() {
		return gen == Gender.MALE ? "Thank you Mr " + name : "Thank you Mrs " + name;
	}
}

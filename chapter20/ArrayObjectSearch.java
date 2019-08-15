package chapter20;

import java.util.Arrays;

class PersonA implements Comparable{
	private String name;
	private int age;
	
	public PersonA(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Object o) {
		return this.age - ((PersonA)o).age; // 나이가 같으면 0을 반환
	}
	
	@Override
	public String toString() {
		return "PersonA [name=" + name + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}
}

public class ArrayObjectSearch {
	public static void main(String[] args) {
		PersonA[] ar = new PersonA[3];
		ar[0] = new PersonA("남도현", 16);
		ar[1] = new PersonA("전정국", 23);
		ar[2] = new PersonA("박지성", 18);
		
		Arrays.sort(ar); // 탐색 전 정렬을 실행
		int idx = Arrays.binarySearch(ar, new PersonA("", 16));
		System.out.println("16세 소년은 ? " + ar[idx].getName());
	}
}

package chapter23.quiz;

import java.util.HashSet;

public class Quiz23_1_1 {
	public static void main(String[] args) {
		HashSet<Person> set = new HashSet<>();
		set.add(new Person("°­¹ÎÈñ", 18));
		set.add(new Person("À¯°­¹Î", 17));
		set.add(new Person("°­¹ÎÈñ", 18));
		set.add(new Person("±¸Á¤¸ð", 20));
		
		for (Person person : set) {
			System.out.print(person + "\t");
		}
		System.out.println();
	}
}

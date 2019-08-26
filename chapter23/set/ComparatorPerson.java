package chapter23.set;

import java.util.TreeSet;

public class ComparatorPerson {
	public static void main(String[] args) {
		TreeSet<Person> tree = new TreeSet<>(new PersonComparator());
		tree.add(new Person("°­", 18));
		tree.add(new Person("±¸", 20));
		tree.add(new Person("³²", 16));
		
		for (Person person : tree) {
			System.out.println(person);
		}
	}
}

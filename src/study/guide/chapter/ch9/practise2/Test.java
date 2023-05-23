package study.guide.chapter.ch9.practise2;

import java.util.HashSet;
import java.util.TreeSet;

public class Test {
	public static void main(String[] args) {
		var set = new TreeSet<Car>();
		set.add(new Car("Car 1"));
		set.add(new Car("Car 2"));
		set.add(new Car("Car 3"));
		set.add(new Car("Car 4"));
		set.add(new Car("Car 5"));
		System.out.println(set);
	}
}

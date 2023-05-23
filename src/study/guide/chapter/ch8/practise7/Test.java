package study.guide.chapter.ch8.practise7;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		Tester tester = Car::run;
		tester.make(new Car(), "bmw");
		/***************************************************/
		Car car = new Car();
		Tester2 tester2 = car::run;
		
		var list = new ArrayList<Car>();
		list.add(new Car());
		list.add(new Car());
		list.add(new Car());
		list.add(new Car());
		list.add(new Car());
		list.add(new Car());
		
		list.stream().forEach(Car::run);
		
		var list2 = new ArrayList<Integer>();
		list2.add(2);
		list2.add(3);
		list2.add(3);
	}
}

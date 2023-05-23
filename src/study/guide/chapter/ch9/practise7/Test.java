package study.guide.chapter.ch9.practise7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		List<Car> cars = new ArrayList();
		cars.add(new Car("KY23"));
		cars.add(new Car("KA21"));
		cars.add(new Car("AB21"));
		cars.add(new Car("AB11"));
		System.out.print(cars);
		Comparator<Car> comparator = (x,y) -> {
			if (x.plate.length()>y.plate.length()) {
				return 1;
			}
			else if (x.plate.length() == y.plate.length()) {
				return 0;
			}
			else {
				return -1;
			}
		};
	cars.sort(comparator);
	}
}

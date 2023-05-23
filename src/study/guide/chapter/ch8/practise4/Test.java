package study.guide.chapter.ch8.practise4;

import java.util.ArrayList;

public class Test {
	static Double res = 1.0;
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		var list = new ArrayList<Double>();
		list.add(new Double(20));
		list.add(new Double(20.2));
		list.add(new Double(10));
		var result = calculator.calculateAnyThing(u->{
			u.forEach(x-> {
				res = x/res;
			});
			return new Double(res);
		}, list);
		System.out.println(result);
	}
}

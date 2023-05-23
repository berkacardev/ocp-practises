package study.guide.chapter.ch8.practise4;

import java.util.List;
import java.util.function.Function;

public class Calculator {
	public Object calculateAnyThing(Function<List<Double>, Double> function, List<Double> numbers) {
		return function.apply(numbers);
	}
}

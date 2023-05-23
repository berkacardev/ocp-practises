package study.guide.chapter.ch10.practise1;

import java.util.stream.Stream;

public class Test {
	public static void main(String[] args) {
		Stream<Integer> result = Stream.iterate(1, t->t+1<2000000, n->n+2);
		result.forEach(System.out::println);
	}
}

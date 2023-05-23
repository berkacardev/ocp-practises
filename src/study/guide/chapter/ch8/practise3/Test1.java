package study.guide.chapter.ch8.practise3;

import java.util.HashMap;
import java.util.function.BiConsumer;

public class Test1 {
	public static void main(String[] args) {
		var map = new HashMap<String, String>();
		BiConsumer<String, String> biConsumer = map::put;
		biConsumer.accept("dsad", "s");
		System.out.println(map);
	}
}

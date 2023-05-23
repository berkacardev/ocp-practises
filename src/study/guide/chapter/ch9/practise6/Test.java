package study.guide.chapter.ch9.practise6;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		
		List<?> x1 = new ArrayList<>();
		var x2 = new ArrayList<>();
		List<Object> x3 = (List<Object>)x2;
		x1 = x2;
	}
}

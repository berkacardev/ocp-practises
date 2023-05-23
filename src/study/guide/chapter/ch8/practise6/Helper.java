package study.guide.chapter.ch8.practise6;

import java.util.Iterator;

public class Helper {
	static Float calculate(Float ... floats) {
		Float res = 0f;
		for(var item : floats) {
			res+=item;
		}
		return res;
	}
	static Float calculate(Float f1, float f2) {
		System.out.println("m2");
		Float res = 0f;
		res = f1+f2;
		return res;
	}
}

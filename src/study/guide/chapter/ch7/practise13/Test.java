package study.guide.chapter.ch7.practise13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		
		Parent.SubClass xClass = new Parent().new SubClass() {};
		List<String> xList = new ArrayList<>();
		for(Integer i = 0; i<20; i++) {
			xList.add(i.toString());
		}
		var result = xList.stream().filter(u -> {
			Integer intValue = Integer.valueOf(u);
			return intValue %3 == 1 ? true: false;
		}).mapToDouble(u -> Double.valueOf(u)).sum();
		System.out.println(result);
		DenemeParent sDenemeParent = new DenemeParent();
	}
}
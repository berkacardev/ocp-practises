package study.guide.chapter.ch9.practise9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(new Person("dsa"));
		list.add(new Person("ddasa"));
		Collections.sort(list);
	}
}

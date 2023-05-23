package study.guide.chapter.ch9.practise8;

import java.util.Comparator;

public class MultiFiledComperator{
	public void compare(Squirrel s1, Squirrel s2) {
		Comparator<Squirrel> comparator = Comparator.comparing(Squirrel::getSpecie);
		System.out.print(comparator.getClass().getName());
		
	}
}

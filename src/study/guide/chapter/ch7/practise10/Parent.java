package study.guide.chapter.ch7.practise10;

public interface Parent {
	int x = 2;
	default void makeDefault() {
		System.out.println("in default metod");
	}
}

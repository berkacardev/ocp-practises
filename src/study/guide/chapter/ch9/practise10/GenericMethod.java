package study.guide.chapter.ch9.practise10;

public class GenericMethod {
	public <E> void genericMethod(E e) {
		System.out.println(e.toString());
	}
	public <T> T genericMethodReturningSomething(T t) {
		return t;
	}
}

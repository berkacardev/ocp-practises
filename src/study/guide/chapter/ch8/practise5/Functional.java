package study.guide.chapter.ch8.practise5;

@FunctionalInterface
public interface Functional<T,R> {
	R change(T t);
	String toString();
	int hashCode();
	default void defaultConsumer() {
		System.out.println("in default metod");
	}
	private void defaultConsumerHelper() {
		System.out.println("in private metod");
	}
	public static void staticMetod() {
		System.out.println("in static metod");
	}
	private void staticMetodPrivate() {
		System.out.println("in private static metod");
	}
}

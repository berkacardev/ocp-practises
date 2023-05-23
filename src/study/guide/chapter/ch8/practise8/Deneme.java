package study.guide.chapter.ch8.practise8;

import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

@FunctionalInterface
public interface Deneme<R> {
	public abstract void accept(String s,UnaryOperator<R> x);
}

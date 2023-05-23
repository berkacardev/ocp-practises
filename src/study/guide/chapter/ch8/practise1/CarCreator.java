package study.guide.chapter.ch8.practise1;

@FunctionalInterface
public interface CarCreator {
	Car create(String mark, String model);
}

package study.guide.chapter.ch8.practise1;

public class Test {
	public static void main(String[] args) {
		CarCreator carCreator = Car::new;
		Car car =  carCreator.create("","");
	}
}

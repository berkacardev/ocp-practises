package study.guide.chapter.ch7.practise2;

public class Dog implements Animal{
	public void bark() {
		Animal.super.bark();
	}
}

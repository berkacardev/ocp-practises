package study.guide.chapter.ch7.practise10;

public abstract class Child implements Parent {

	public void doSomething() {
		Parent.super.makeDefault();
	}
}

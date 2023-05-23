package study.guide.chapter.ch7.practise12;

public class Test {
	public static void main(String[] args) {
		Object xObject = new Object();
		Parent2 parent2 = (Parent2)xObject;
	}
	public void m1() {
		mInt();
	}
	public int mInt() {
		return 2;
	}
}

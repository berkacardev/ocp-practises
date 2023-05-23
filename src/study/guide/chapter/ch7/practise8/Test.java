package study.guide.chapter.ch7.practise8;

public class Test {
	public static void main(String[] args) {
		OuterClass outerClass = new OuterClass();
		var x = outerClass.new Ineer();
		var z = new OuterClass.StaticInnerClass();
	}
}

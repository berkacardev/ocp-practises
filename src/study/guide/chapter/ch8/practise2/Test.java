package study.guide.chapter.ch8.practise2;

public class Test {
	public static void main(String[] args) {
		String str ="dsad";
		StringChecker stringChecker = str::length;
		System.out.println(stringChecker.check());
	}
}

package study.guide.chapter.ch8.practise6;

public class Test {
	public static void main(String[] args) {
		StringChecker stringChecker = String::startsWith;
		System.out.println(stringChecker.cheeck("berkacar", "ber"));
		
		
		
		
		Convertor convertor = Helper::calculate;
		System.out.println(convertor.calcuFloat(10f, 20f));
	}
}

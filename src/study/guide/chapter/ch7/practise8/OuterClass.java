package study.guide.chapter.ch7.practise8;

public class OuterClass {

	protected static class StaticInnerClass{
		
	}
	
	public class Ineer{
		
	}
	public void make() {
		class LocalIneerClass{
			public int filed1;
			protected String filed2;
			void printInfo() {
				System.out.println(this.filed1+":"+this.filed2);
			}
		}
		
	}
}

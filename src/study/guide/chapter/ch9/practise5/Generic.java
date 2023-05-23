package study.guide.chapter.ch9.practise5;

public class Generic<T> {
	public void doSomething(T T) {
		var res =  T.toString();
	}
	public static void main(String[] args) {
		int x = 0;
		int y = 5;
		while(y-->0) {
			x++;
		}
		System.out.println(x);
	}
}

package study.guide.chapter.ch9.practise2;

public class Car<T extends Car> implements Comparable<T>{
	public static int numberOfCreatingInstance;
	private String mark;
	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}
	@Override
	public int hashCode() {
		int res = (int)Math.abs(Math.random()*100);
		System.out.println(res);
		return res;
	}
	@Override
	public String toString() {
		return "Mark: "+getMark();
	}
	static {
		numberOfCreatingInstance = 1;
	}
	public Car(String mark) {
		setMark(mark);
		numberOfCreatingInstance++;
	}
	@Override
	public int compareTo(T o) {
		return this.hashCode() > o.hashCode() ? -1:1;
	}
	
}

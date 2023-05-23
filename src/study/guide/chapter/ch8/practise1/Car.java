package study.guide.chapter.ch8.practise1;

public class Car {
	private String mark;
	public Car() {
		System.out.println("in constractor 1");
	}
	public Car(String mark) {
		this.mark = mark;
		System.out.println("in constractor 2");
	}
	public Car(String mark, String model) {
		System.out.println("in constractor 3");
	}
	public void setName(String mark) {
		this.mark = mark;
	}
	public String getName(){
		return this.mark;
	}
}

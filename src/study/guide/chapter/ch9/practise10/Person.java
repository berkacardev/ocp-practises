package study.guide.chapter.ch9.practise10;

public class Person {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Person(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Name: "+this.name;
	}
}

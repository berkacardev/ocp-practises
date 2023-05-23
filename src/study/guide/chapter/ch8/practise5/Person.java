package study.guide.chapter.ch8.practise5;

public class Person {
	String name;
	int age;
	public Person() {
		
	}
	public Person(Object o) {
		
	}
	public Person(String name, int age) {
		this.name = name;
		this.age =age;
	}
	@Override
	public String toString() {
		return this.name + ":"+this.age;
	}
	public Person makeSomethingToThis(Functional<Person, Person> function) {
		return function.change(this);
	}
}

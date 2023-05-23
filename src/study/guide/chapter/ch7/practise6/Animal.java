package study.guide.chapter.ch7.practise6;

public sealed class Animal permits Animal.InnerClass, Deneme {
	
	public non-sealed class InnerClass extends Animal{
		
	}
	
	public static void main(String[] args) {
		new Deneme().make();
		var animal = new Animal();
		
	}
} 
non-sealed class Deneme extends Animal{
	void make() {
		System.out.println("making it");
	}
}

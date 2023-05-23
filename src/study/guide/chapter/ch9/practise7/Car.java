package study.guide.chapter.ch9.practise7;

public class Car implements Comparable<Car> {
	String plate;
	public Car(String plate){
		this.plate = plate;
	}
	@Override
	public int compareTo(Car o) {
		return plate.compareTo(o.plate);
	}
	@Override
	public String toString() {
		return "Plate : "+this.plate;
	}
}

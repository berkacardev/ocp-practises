package study.guide.chapter.ch7.practise4;

public enum Cities {

	IZMIR("Berk",34),MARDIN("NURSEL",47),ISTANBUL("Hamdiye",34);
	private Cities(String mostFameousPersonName, int plate) {
		staticMethod();
		System.out.println("in constorctor");
		this.mostFameousPersonName = mostFameousPersonName;
		this.plate = plate;
	}
 	private String mostFameousPersonName;
 	private int plate;
	{

		System.out.println("in init");
	}
	public static void staticMethod() {
		System.out.println("in Static metod");
	}
	static {
		System.out.println("in static init");
	}
	
}

package study.guide.chapter.ch7.practise5;

public enum Season implements Parent {
	WINTER{
		public String getHours() {
			return "10-15";
		}
		@Override
		public void denemex() {
			// TODO Auto-generated method stub
			
		}
	},
	SPRING{
		public String getHours() {
			return "10-15";
		}
		@Override
		public void denemex() {
			// TODO Auto-generated method stub
			
		}
	};
	public void namex() {
		System.out.println("in namex metod");
	}
	public abstract void denemex();
}

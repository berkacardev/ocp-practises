package study.guide.chapter.ch9.practise4;

public class User {
	private int id;
	private String userMail;
	private static int creatingNumberForId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserMail() {
		return userMail;
	}
	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}
	public User() {
		creatingNumberForId++;
	}
	
	public User(String userMail) {
		this();
		this.id = creatingNumberForId;
		this.userMail = userMail;
	}
	@Override
	public String toString() {
		return "[id :"+this.getId()+" userMail :"+this.getUserMail()+"]";
	}
}

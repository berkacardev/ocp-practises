package study.guide.chapter.ch9.practise4;

public class Test {
	public static void main(String[] args) {
		AbstractUserDao userDao = new UserDaoBasicDataBase();
		userDao.add(new User("ber"));
		userDao.add(new User("nur"));
		userDao.add(new User("mer"));
		userDao.add(new User("cer"));
		userDao.add(new User("der"));
		userDao.add(new User("yer"));
		userDao.add(new User("zer"));
		userDao.add(new User("ter"));
		System.err.println(userDao.getById(2));
	}
}

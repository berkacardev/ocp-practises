package study.guide.chapter.ch9.practise4;

import java.util.ArrayList;
import java.util.List;

public class UserDaoBasicDataBase implements AbstractUserDao{

	private static List<User> userTable = new ArrayList<>();
	@Override
	public User add(User t) {
		return userTable.add(t) ? userTable.get(userTable.indexOf(t)) : null;
	}

	@Override
	public boolean remove(User t) {
		return userTable.remove(t);
	}

	@Override
	public List<User> getAll() {
		return userTable;
	}

	@Override
	public User getById(int id) {
		return userTable.stream().filter(u-> u.getId() == id).findAny().orElse(null);
	}

	@Override
	public User update(User t) {
		int indexId = userTable.indexOf(t);
		if (indexId>0) {
			User user = userTable.get(indexId);
			user.setUserMail(t.getUserMail());
			return user;
		}
		return null;
	}

}

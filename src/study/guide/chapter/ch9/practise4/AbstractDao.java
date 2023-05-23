package study.guide.chapter.ch9.practise4;

import java.util.List;

public interface  AbstractDao<T> {
	public abstract T add(T t);
	public abstract boolean remove(T t);
	public abstract List<T> getAll();
	public abstract T getById(int id);
	public abstract T update(T t);
}

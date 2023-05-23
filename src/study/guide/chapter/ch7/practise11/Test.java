package study.guide.chapter.ch7.practise11;

import java.util.ArrayList;
import java.util.List;

interface Walk{
	public static List move() {
		return null;
	}
}
interface Run extends Walk {
	public ArrayList move();
}
class Leopard implements Walk{
	public static Integer move() {
		return null;
	};
}
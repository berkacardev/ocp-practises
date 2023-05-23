package study.guide.chapter.ch9.practise3;

import java.util.HashMap;
import java.util.Map;

public class Test2 {
	public static void main(String[] args) {
		Map<Integer, Character> map = new HashMap<>();
		map.put(1, 'c');
		map.put(2, 'x');
		map.put(5, 'a');
		map.put(4, 'b');
		var res = map.entrySet();
		res.forEach(e-> System.out.println(e.getKey()+":"+e.getValue()));
	}
}

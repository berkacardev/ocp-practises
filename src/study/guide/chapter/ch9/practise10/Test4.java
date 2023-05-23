package study.guide.chapter.ch9.practise10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test4 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("Jenny", "Bus Tour");
		map.putIfAbsent("Jenny", "Tram");
		System.out.println(map);
		List<String> list = new ArrayList<>();
		list.add("das");
		list.add("dadsa");
		list.add("dasdddas");
		var stream = list.stream();
	}
}

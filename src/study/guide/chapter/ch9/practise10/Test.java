package study.guide.chapter.ch9.practise10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		Map<Integer, String> json = new HashMap<>();
		json.put(1, "berk");
		json.put(2, "acar");
		json.put(3, "nursel");
		var res = json.keySet();
		for(var item : res) {
			System.out.println(item+"-> "+json.get(item));
		}
	}
}

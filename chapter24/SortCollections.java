package chapter24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortCollections {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("남도현", "강민희", "구정모", "전정국");
		list = new ArrayList<>(list);
	}
}

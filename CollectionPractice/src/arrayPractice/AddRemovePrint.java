package arrayPractice;

import java.util.ArrayList;
import java.util.List;

public class AddRemovePrint {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(54);
		list.add(65);
		list.add(7756);
		list.add(24);
		list.add(34);
		list.add(654);
		list.add(54);
		list.add(53);
		list.add(24);
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);
	}
}

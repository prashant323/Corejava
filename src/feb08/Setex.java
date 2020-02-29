package feb08;

import java.util.HashSet;

public class Setex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<>();
		
		set.add("Maharashtra");
		set.add("karnataka");
		set.add("Gujarat");
		set.add("Maharashtra");
		set.add("telangana");
		set.add("null");
		set.add("null");
		System.out.println(set);
		
		for (String s : set) {
			System.out.println(s);
		}
	}

}

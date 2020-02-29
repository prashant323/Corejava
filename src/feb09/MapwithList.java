package feb09;

import java.util.ArrayList;
import java.util.HashMap;

public class MapwithList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, ArrayList<String>> map = new HashMap<>();
		ArrayList<String> list1 = new ArrayList<>();
		
		list1.add("Prashant");
		list1.add("Fin.");
		list1.add("Dev.");
		
		ArrayList<String> list2 = new ArrayList<>();
		list1.add("Sony");
		list1.add("AAAA.");
		list1.add("Test.");
		map.put(11111, list1);
		
		
		
		System.out.println(map);
	}

}

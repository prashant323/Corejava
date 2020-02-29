package feb09;

import java.util.ArrayList;
import java.util.HashMap;

public class MapwithMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, HashMap<Integer , ArrayList<String>>> map = new HashMap<>();
		ArrayList<String> list1 = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();
		ArrayList<String> list3 = new ArrayList<>();
		
		HashMap<Integer , ArrayList<String>> details = new HashMap<>();
		HashMap<Integer , ArrayList<String>> details1 = new HashMap<>();
		HashMap<Integer , ArrayList<String>> details2 = new HashMap<>();
		
		list1.add("Prashant");
		list1.add("Dev.");
		list1.add("JAVA.");
		
		
		list2.add("ABC");
		list2.add("DEV.");
		list2.add(".NET");
		
//		list2.add("XYZ");
//		list2.add("Tester.");
//		list2.add("Manual.");
		
		list3.add("PDD");
		list3.add("TESTER.");
		list3.add("AUTO.");
		
		details.put(1001, list1);
		details1.put(1002, list2);
		details2.put(1003, list3);
		
		map.put("FINANCE", details);
		map.put("INvEsTMENT", details1);
		map.put("ASSET", details2);
		
		
		System.out.println(map);
		System.out.println(map.g);
		
		
		
		
		
		
		

	}

}

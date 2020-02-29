package feb09;

import java.util.HashMap;

public class MapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("Pune", 4111014);
		map.put("nsk", 40000014);
		map.put("Mumbai", 40000001);
		
		
		System.out.println(map);
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		System.out.println(map.size());
		
		map.replace("Pune",10000001);
		System.out.println(map);
		
		System.out.println(map.containsKey("Nashik"));
		
		//System.out.println(map.remove("Pune", 000000000));
	}

}

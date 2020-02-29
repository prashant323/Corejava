package feb08;

import java.util.ArrayList;

public class ListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> obj = new ArrayList<>();
		obj.add("Pune");
		obj.add("nashik");
		obj.add("mumbai");
		obj.add("Pune");
		obj.add("nashik");
		System.out.println(obj);
		
		System.out.println(obj.size());
		
		System.out.println(obj.contains("Delhi"));
		System.out.println(obj.contains("nashik"));
		System.out.println(obj.indexOf("mumbai"));
		System.out.println(obj.indexOf("Pune"));
		System.out.println(obj.get(3));
		System.out.println(obj.subList(0, 3));
		//List<String> newList = obj.subList(0, 3);
		//newlist.add("pune")
		
		for(int i=0 ; i<obj.size(); i++) {
			System.out.println(obj.get(i)+ "  ");
		}
//		for (String value : obj ) {
//			System.out.println(value);
			
		}
		
	}

}

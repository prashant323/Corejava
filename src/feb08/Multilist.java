package feb08;

import java.util.ArrayList;

public class Multilist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>>lists = new ArrayList<>();
		
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		ArrayList<Integer> list3 = new ArrayList<>();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		
		list2.add(4);
		list2.add(5);
		list2.add(6);
		list2.add(7);
		
		list3.add(44);
		list3.add(22);
		list3.add(11);
		
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
		
		
		lists.add(list1);
		lists.add(list2);
		lists.add(list3);
		
		System.out.println(lists);
		
				
		System.out.println(lists.get(1).get(1));
		
		
	}

}

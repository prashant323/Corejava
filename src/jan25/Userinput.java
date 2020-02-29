package jan25;

import java.util.Scanner;

public class Userinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter uour name");
		String name = obj.nextLine();
		System.out.println("enter your city");
		String city = obj.nextLine();
		System.out.println("pincode");
		int pincode = obj.nextInt();
		
		System.out.println("hello"+ name +" your city"+ city + pincode);
		
	}

}

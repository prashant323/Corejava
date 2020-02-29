package jan20;

import java.util.Scanner;

public class palindromeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		Scanner objString = new Scanner(System.in);
		System.out.println("Enter no ");
 		int number = obj.nextInt();
		checknumberpalindrome(number);
		System.out.println(" Do u want con? Y/N");
		String userchoice = objString.nextLine();
		while(userchoice.equals("Y")) {
			System.out.println("Enter no.");
			number = obj.nextInt();
			checknumberpalindrome(number);
			System.out.println(" Do u want con? Y/N");//incomplit
			String userchoice = objString.nextLine();
				
		}
 		
 		static void checknumberpalindrome(int number) {
 			
 		
 		int r;
		int sum=0;
		int temp;
		
		//int number = 101;
		temp = number;
		
		while(number > 0) {
			r = number % 10;
			sum = (sum * 10) + r;
			number = number / 10;
		}
		if(temp==sum)
			System.out.println("Num. is palindrome"+ temp);
		else
			System.out.println("Num. is not palindrome"+ temp);
		//System.out.println("");
	}
	 
	   
}
}
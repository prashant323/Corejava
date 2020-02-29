package jan25;

import java.util.Scanner;

public class userpalin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter no ");
 		int number = obj.nextInt();
     // incomplit
 		temp= 0;
 		
 		num = number;
		
		while(number > 0) {
			r = number % 10;
			sum = (sum * 10) + r;
			number = number / 10;
		}
		if(temp==sum)
			System.out.println("Num. is palindrome"+ temp);
		else
			System.out.println("Num. is not palindrome"+ temp);
	}
	}

}

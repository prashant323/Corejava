package jan20;

public class Swapno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20;
		int b=30;
		//int temp;
		
		System.out.println("----Before Swap-----");
		System.out.println(" 1st No is = " + a);
		System.out.println(" 2nd No is= " + b);
		
		//temp= a;// using 3rd Variable
		//a=b;
		//b= temp;
		
		a=a+b;// using 2 variable.
		b=a-b;
		a=a-b;
		
		System.out.println("----After Swap-----");
		System.out.println("1st No is = " + a);
		System.out.println("2nd No is= " + b);
		
		
	}

}

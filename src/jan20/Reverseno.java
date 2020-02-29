package jan20;

public class Reverseno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int num=1234;
	int r=0;
	int digit;
	
	while(num!=0) {
		
		digit=num%10;
		r=r*10+digit;
		num/=10;
	}
		System.out.println("Reverse No is=" + r);
	}

}

package jan19;

public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int x=1; x<=10; x++) {
			System.out.println(x);
			
			if (x==5) {
				break;
				//continue;
			}
		}
		System.out.println("Out sidr for loop");

	}

}

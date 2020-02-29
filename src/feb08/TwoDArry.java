package feb08;

public class TwoDArry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] num= {{1,2,3,4},{5,6,7}};
		
		//System.out.println(num[1][1]);
		
		for(int i=0;i<num.length;i++) {
			
			for(int j=0;j<num[i].length;j++) {
				
				System.out.print(num[i][j] + "    ");
				
			}
			System.out.println();
		}
	}

}

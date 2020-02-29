package jan26;

public class Diff21 {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		public int diff21(int num) {
			int result =0;
			if (num<=21) {
				result = 21-num;
				
			}else {
				result = 2* (num-21);
			}
			
			return result;
			
		}
	}
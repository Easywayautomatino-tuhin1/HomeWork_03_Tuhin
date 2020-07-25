package HW;

public class Exercise_08 {

	public static void main(String[] args) {

		int[] A = {4,2,5,7,8,9,5};
		
		int n=7;
		boolean flag = false;
		
		for (int i = 0; i < A.length; i++) {
			if(A[i]==n) {
				flag= true;
				break;
			}
		}
		
		if(flag) {
			System.out.println("Data found");
		}else {
			System.out.println("Data not Found");
		}
	}

}

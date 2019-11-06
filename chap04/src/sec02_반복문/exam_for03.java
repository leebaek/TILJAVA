package sec02_반복문;

public class exam_for03 {

	public static void main(String[] args) {
		// for문으로 
		/*
		  *
		  **
		  ***
		  **** 출력하기*/
//		for (int i = 1; i<= 4; i++) {
//			if(i == 1) {
//				System.out.println("*");
//			} else if (i == 2) {
//				System.out.println("**");
//			} else if (i == 3) {
//				System.out.println("***");
//			} else if (i == 4) {
//				System.out.println("****");
//			}
//		}
//	}
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
				if (j == i) {
					System.out.println();
				}
			}
		}
	}
}
package sec02_반복문;

public class exam_for01 {

	public static void main(String[] args) {
		// 1~100 정수 중 3의 배수의 총합
		int sum = 0;
		
		for (int i=1; i<=100; i++) {
			if(i%3 == 0) {
				sum += i;
			}
		}
		System.out.println("3의 배수의 총합 : " + sum);
	}

}

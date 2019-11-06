package sec02_반복문;

public class for문합출력 {

	public static void main(String[] args) {
		// 1부터 100까지 합 출력
		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			sum += i;
		}
		System.out.println("1~100까지의 합 : " + sum);
	}

}

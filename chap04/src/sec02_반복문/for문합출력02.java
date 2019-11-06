package sec02_반복문;

public class for문합출력02 {

	public static void main(String[] args) {
		// 1부터 100까지의 합을 출력
		int sum = 0;
		
		int i = 0;
		for(i=1; i<=100; i++) {
			sum += i;
		}
		System.out.println("1부터" + (i-1) + "합 : " + sum);
		// 루프 카운터 변수를 사용할 수 있다.
	}

}

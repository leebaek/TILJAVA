package sec02_반복문;

public class while문합출력 {

	public static void main(String[] args) {
		// while문 1~100까지 합 출력
		int sum=0, i=1;
		
		while(i<=100) {
			sum+=i;
			i++;
		}
		System.out.println("1~100까지의 합 : " + sum);
	}

}

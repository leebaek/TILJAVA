package sec02_반복문;

public class continue를사용한for문 {

	public static void main(String[] args) {
		// continue를 사용한 for문
		for(int i=1; i<=10; i++) {
			if(i%2 != 0) {
				continue; // for문의 조건식으로 이동한다.
			}
			System.out.println(i);
		}

	}

}

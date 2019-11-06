package sec02_반복문;

public class 바깥쪽반복문종료 {

	public static void main(String[] args) {
		// 바깥쪽 반복문 종료
		Outter : for(char upper='A'; upper<='Z'; upper++) { // 바깥 for문에 라벨을 붙인다.
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower=='g') {
					break Outter; // 라벨을 붙인 for문을 종료시킨다.
				}
			}
		}
	System.out.println("프로그램 실행 종료");
	}

}

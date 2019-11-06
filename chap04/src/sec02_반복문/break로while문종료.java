package sec02_반복문;

public class break로while문종료 {

	public static void main(String[] args) {
		// break로 while문 종료
		while(true) {
			int num = (int) (Math.random() * 6) + 1;
			System.out.println(num);
			if(num == 6) {
				break; // "프로그램 종료"를 출력하고 종료한다.
			}
		}
		System.out.println("프로그램 종료");
	}
}
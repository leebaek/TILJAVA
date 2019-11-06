package sec02_반복문;

public class exam_while01 {

	public static void main(String[] args) {
		/* while문과 Math.random() 메소드로 2개 주사위를 던졌을 때 나오는 눈을 (눈1, 눈2) 형태로 출력하고
		 눈의 합이 5가 아니면 계속 주사위를 던지고, 눈의 합이 5이면 실행을 멈추는 코드 작성*/
		
		while(true) {
			int i = (int) (Math.random() * 6) + 1;
			int j = (int) (Math.random() * 6) + 1;
			System.out.println("(" + i + "," + j + ")");
			if (i+j == 5) {
				break;
			}
		}
	}
}
package sec04;

public class ContinueKeyCodeReadExample {

	public static void main(String[] args) throws Exception {
		// 입력된 키의 개수와 상관없이 키코드 읽기
		int KeyCode;
		
		while(true) { // 무한반복으로 계속해서 입력값을 받아 출력한다.
			KeyCode = System.in.read();
			System.out.println("KeyCode: " + KeyCode);
		}

	}

}

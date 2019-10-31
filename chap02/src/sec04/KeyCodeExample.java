package sec04;

public class KeyCodeExample {

	public static void main(String[] args) throws Exception {
		// 입력된 키코드를 변수에 저장
		int KeyCode;
		
		KeyCode = System.in.read();
		System.out.println("KeyCode: " + KeyCode);
		
		KeyCode = System.in.read();
		System.out.println("KeyCode: " + KeyCode);
		
		KeyCode = System.in.read();
		System.out.println("KeyCode: " + KeyCode);
	}

}

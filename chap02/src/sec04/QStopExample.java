package sec04;

public class QStopExample {

	public static void main(String[] args) throws Exception {
		// q입력시 반복 종료
		int KeyCode;
		
		while(true) {
			KeyCode = System.in.read();
			System.out.println("KeyCode: " + KeyCode);
			if(KeyCode == 113) {
				break;
			}
		}
		System.out.println("종료");
	}

}

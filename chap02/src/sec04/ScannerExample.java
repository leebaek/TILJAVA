package sec04;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) throws Exception {
		// 키보드에서 입력된 내용을 문자열로 얻기
		Scanner scanner = new Scanner(System.in); // python -> input()과 같다.
		String inputData;
		
		while(true) {
			inputData = scanner.nextLine(); // nextLine : enter키 이전까지 입력된 문자열을 읽음.
			System.out.println("입력된 문자열: \"" + inputData + "\"");
			if(inputData.contentEquals("q")) {
				break;
			}
		}
		System.out.println("종료");
	}

}

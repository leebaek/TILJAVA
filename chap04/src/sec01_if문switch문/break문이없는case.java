package sec01_if문switch문;

public class break문이없는case {

	public static void main(String[] args) {
		// break문이 없는 case(switch문)
		int time = (int) (Math.random() * 4) + 8; // 8~11정수 뽑기
		System.out.println("[현재 시각: " + time + " 시]");
		
		switch(time) {
		case 8:
			System.out.println("출근합니다.");
		case 9:
			System.out.println("회의합니다.");
		case 10:
			System.out.println("업무를 봅니다.");
		default:
			System.out.println("외근을 나갑니다.");
		}

	}

}

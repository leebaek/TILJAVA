package sec01_if문switch문;

public class char타입switch문 {

	public static void main(String[] args) {
		// char타입의 switch문
		char grade = 'a';
		
		switch(grade) {
		case 'A':
		case 'a':
			System.out.println("우수회원입니다.");
			break;
		case 'B':
		case 'b':
			System.out.println("일반회원입니다.");
			break;
		default:
			System.out.println("손님입니다.");
		}

	}

}

package sec01_if문switch문;

public class switch문으로주사위 {

	public static void main(String[] args) {
		// switch문으로 주사위 뽑기
		int num = (int) (Math.random() * 6) + 1;
		
		switch(num) {
		case 1:
			System.out.println("1입니다.");
			break;
		case 2:
			System.out.println("2입니다.");
			break;
		case 3:
			System.out.println("3입니다.");
			break;
		case 4:
			System.out.println("4입니다.");
			break;
		case 5:
			System.out.println("5입니다.");
			break;
		default:
			System.out.println("6입니다.");
			break;
		}
	}

}

package sec01_if문switch문;

public class if문으로주사위 {

	public static void main(String[] args) {
		// if문으로 주사위 번호뽑기
		int num = (int) (Math.random() * 6) + 1;
		//Math.random() : 0 <= A < 1 사이의 double타입 난수를 리턴
		//Math.random() * 6 : 0 <= A < 6
		//(int) (Math.random() * 6) : int타입으로 변환해서 정수를 뽑도록 만든다.
		//(int) (Math.random() * 6) + 1 : 범위가 0~5이므로 0~6으로 만들어준다.
		if(num==1) {
			System.out.println("1입니다.");
		} else if(num==2) {
			System.out.println("2입니다.");
		} else if(num==3) {
			System.out.println("3입니다.");
		} else if(num==4) {
			System.out.println("4입니다.");
		} else if(num==5) {
			System.out.println("5입니다.");
		} else {
			System.out.println("6입니다.");
		}

	}

}

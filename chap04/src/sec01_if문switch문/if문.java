package sec01_if문switch문;

public class if문 {

	public static void main(String[] args) {
		// if문
		int score = 93;
		
		if(score>=90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}
		
		if(score<90)
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다."); //if문에 중괄호가 없어서 if문에 속하지 않는다.
	}
}
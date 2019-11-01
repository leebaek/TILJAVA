package sec02_연산자의종류;

public class 삼항연산자 {

	public static void main(String[] args) {
		// 삼항 연산자
		int score = 85;
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		
		// if ~ else문으로 이렇게 표현가능하다!
//		int score = 85;
//		char grade;
//		if(score > 90) {
//			grade = 'A';
//		}
//		else {
//			grade = 'B';
//		}
		
		System.out.println(score + "점은 " + grade + "등급입니다.");

	}

}

package sec02_연산자의종류;

public class 논리연산자 {

	public static void main(String[] args) {
		// 논리 연산자
		int charCode = 'A';
		
		if((charCode>=65) & (charCode<=90)) {
			System.out.println("대문자");
		}
		
		if((charCode>=97) && (charCode<=122)) {
			System.out.println("소문자");
		}
		
		if(!(charCode<48) && (charCode>57)) {
			System.out.println("0~9");
		}
		
		int value = 6;
		
		if((value%2==0) | (value%3==0)) {
			System.out.println("2 또는 3의 배수");
		}
		
		if((value%2==0) || (value%3==0)) {
			System.out.println("2 또는 3의 배수");
		}

	}

}

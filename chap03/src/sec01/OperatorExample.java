package sec01;

public class OperatorExample {

	public static void main(String[] args) {
		// 연산자
		int x = 1;
		int y = 2;
		int result01 = x + y; // '+'는 연산자, 'x', 'y'는 피연산자
		System.out.println(result01);
		
		boolean result02 = (x + y) < 5;
		System.out.println(result02);
		
		System.out.println(x > 0 & y < 0); // AND 비트연산자, ><가 &보다 우선순위가 높기 때문에 먼저 수행된다.
		System.out.println(x > 0 && y < 0); // AND 논리연산자
		
		System.out.println(x > 0 | y < 0); // OR 비트연산자, ><가 |보다 우선순위가 높기 때문에 먼저 수행된다.
		System.out.println(x > 0 || y < 0); // OR 논리연산자
		
		System.out.println(100 * 2 / 3 % 5); // 100*2=200, 200/3=66, 66%5='1'

	}

}

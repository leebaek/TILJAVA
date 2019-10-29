package sec03;

public class ByteOperationExample {

	public static void main(String[] args) {
		// 정수 타입의 연산(byte & int)
		byte result1 = 10 + 20;
		System.out.println(result1);
		
		byte x = 10;
		byte y = 20;
//		byte result2 = x + y; // byte변수인 x, y가 피연산자로 사용이 되면 int 타입으로 변환되어 연산되므로 오류가 발생한다. 
		int result2 = x + y;
		System.out.println(result2);

	}

}

package sec03;

public class LongOperationExample {

	public static void main(String[] args) {
		// 정수 타입의 연산(long & int)
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000L;
		long result = value1 + value2 + value3; // long타입은 int타입보다 크기 때문에 결과도 long으로 저장해야 한다.
		System.out.println(result);

	}

}

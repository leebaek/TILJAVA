package sec03;

public class OperationsPromotionExample {

	public static void main(String[] args) {
		// 연산식에서 자동 타입 변환
		byte byteValue1 = 10;
		byte byteValue2 = 20;
//		byte byteValue3 = byteValue1 + byteValue2; // byte변수가 피연산자로 사용되어 연산하면 int타입으로 변환된다.
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
//		char charValue3 = charValue1 + charValue2; 
		int intValue2 = charValue1 + charValue2; // char변수가 피연산자로 사용되어 연산하면 int 타입으로 변환한다.
		System.out.println("유니코드=" + intValue2);
		System.out.println("출력문자=" + (char)intValue2);
//		System.out.println(charValue3);
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;
		System.out.println(intValue4);
		
		int intValue5 = 10;
//		int intValue6 = 10 / 4.0; // 소수점이 있기 때문에 int 타입으로 저장 불가
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);
//		System.out.println(intValue6);
		
		int x = 1;
		int y = 2;
		double result = (double) x / y;
		System.out.println(result);

	}

}

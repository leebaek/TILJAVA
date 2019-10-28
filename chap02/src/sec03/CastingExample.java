package sec03;

public class CastingExample {
	public static void main(String[] args) {
		// 강제 타입 변환 : 큰 허용 범위 타입을 작은 허용 범위 타입으로 변환할 수 있다.
		// byte < short < int < long < float < double
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14f;
		intValue = (int) doubleValue;
		System.out.println(intValue);
	}

}

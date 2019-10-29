package sec03;

public class StringConcatExample {

	public static void main(String[] args) {
		// 문자열 결합 연산
		// 숫자 연산
		int value = 10 + 2 + 8;
		System.out.println("value: " + value);
		
		// 문자열 결합 연산
		// 문자열을 만나기 전까지는 + 연산을 하다가 문자열을 만나면 뒤로부터는 문자를 결합하게 된다.
		String str1 = 10 + 2 + "8";
		System.out.println("str1: " + str1); // 10+2 = 12, 문자열 8 ==> 12+8 = 128
		
		String str2 = 10 + "2" + 8;
		System.out.println("str2: " + str2); // 10+문자열 2 + 8 ==> 102+8 = 1028
		
		String str3 = "10" + 2 + 8;
		System.out.println("str3: " + str3); // 문자열10+2+8 ==> 102+8 = 1028
		
		String str4 = "10" + (2 + 8);
		System.out.println("str4: " + str4); // 문자열10+(2+8) ==> 10+10 = 1010

	}

}

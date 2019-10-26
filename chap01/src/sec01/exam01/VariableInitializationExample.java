package sec01.exam01;

public class VariableInitializationExample {

	public static void main(String[] args) {
//		int value;
		int value = 5;
		int result = value + 10; //value의 초기값이 정의되지 않았기 때문에 오류가 발생한다.
		System.out.println(result);

	}

}

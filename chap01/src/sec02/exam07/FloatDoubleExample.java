package sec02.exam07;

public class FloatDoubleExample {

	public static void main(String[] args) {
		//실수값 저장
//		float var1 = 3.14; //float 타입임을 알리는 f를 뒤에 붙여야 한다.
		float var2 = 3.14f;
		double var3 = 3.14;
		
		//정밀도 검사
		float var4 = 0.1234568790123456789f;
		double var5 = 0.1234567890123456789;
		
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5); // float 타입보다 double 타입이 두 배 정밀하다.
		
		//e 사용하기
		double var6 = 3e6; // 3x10^6
		float var7 = 3e6F;
		double var8 = 2e-3; // 2x10^(-3)
		System.out.println(var6);
		System.out.println(var7);
		System.out.println(var8);
	}

}

package sec02_연산자의종류;

public class 증감연산자 {

	public static void main(String[] args) {
		// 증감 연산자
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("-------------------------");
		x++;
		++x;
		System.out.println("x=" + x);
		
		System.out.println("-------------------------");
		y--;
		--y;
		System.out.println("y=" + y);
		
		System.out.println("-------------------------");
		z = x++;	//후증가 -> x의 값을 z에 대입하고 나서 1증가됨
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("-------------------------");
		z = ++x;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("-------------------------");
		z = ++x + y++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);

	}

}

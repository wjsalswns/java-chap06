package chap06;

public class _05_Overloading {
	
	public static int getPower(int num) {
		int result = num * num;
		return result;
		
	}
	
	public static int getPower(String strNum) {
		int num = Integer.parseInt(strNum);
		return num;
	}
	
	public static int getPower(int num, int exp) {
		int result = 1;
		for (int i=0; i<exp; i++) {
			result *= num;
		}
		return result;
	}
	
	public static void main(String[] args) {
		// 메소드 오버로딩
		// 같은 이름의 메소드를 여러 번 선언
		
		// 조건
		// 1. 파라미터의 타입이 다르다.
		// 2. 파라미터의 개수가 다르다.
		System.out.println(getPower(5));
		System.out.println(getPower(5));
		System.out.println(getPower(3, 4));
	}
	
}

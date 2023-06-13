package chap_06;
public class _06_WhenToUse {
	
	public static int getPower(int number, int exponent) {
		int result = 1;
		for (int i=0; i<exponent; i++) {
			result *= number;
		}
		return result;
	}
	
	public static int getPower(int number) {
		//	int result = number * number;
		//	return result;
		
		// 메소드 안에서 다른 메소드 호출
		return getPower(number, 2);
	}
	
	// 메소드가 필요한 이유
	// 반복되는 코드의 중복을 줄일 수 있음
	// 수정사항이 발생 시 유지보수가 편함
	
	public static void main(String[] args) {
		
		// 2의 2제곱 구하기
		
		int result = 1;
		
		for (int i=0; i<2; i++) {
			result = result * 2;
		}
		System.out.println(result);
		
		
		// 3의 3제곱 구하기
		
		result = 1;
		for (int i=0; i<3; i++) {
			result = result * 3;
		}
		System.out.println(result);
		
		// 4의 2제곱 구하기
		
		result = 1;
		for (int i=0; i<2; i++) {
			result = result * 4;
		}
		System.out.println(result);
		
		System.out.println("---------------");
		
		System.out.println("메인에서 코드 실행 : " + result);
		System.out.println("메소드 호출하여 실행 : " + getPower(4, 2));
		
		// 오버로딩을 이용해 11의 제곱 구하기
		System.out.println(getPower(11));
	}
}

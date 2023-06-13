package chap_06;

import java.util.Scanner;

public class _Prog_Calculator {
	
	public static int plus(int num1, int num2) {
		return num1 + num2;
	}
	
	private static int minus(int num1, int num2) {
		return num1 - num2;
	}
	
	public static int mul(int num1, int num2) {
		return num1 * num2;
	}
	
	public static double divide(int num1, int num2) {
		if (num2 == 0) System.out.println("분모에 0이 올 수 없습니다");
		return (double)num1 / num2;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 수 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 수 : ");
		int num2 = sc.nextInt();
		System.out.print("연산자 종류(+, -, *, /) : ");
		String oper = sc.next();
		
		if (oper.equals("+")) {
			System.out.println("두 수의 합 : " + plus(num1, num2));
		} else if (oper.equals("-")) {
			System.out.println("두 수의 차 : " + minus(num1, num2));
		} else if (oper.equals("*")) {
			System.out.println("두 수의 곱 : " + mul(num1, num2));
		} else if (oper.equals("/")) {
			System.out.println("두 수의 몫 : " + divide(num1, num2));
		}
	}
	
}

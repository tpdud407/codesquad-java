package codesquad.calendar;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		System.out.println("두 수를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		int number1, number2;
		String s1,s2;
		s1 = scanner.next();
		s2 = scanner.next();
		number1 = Integer.parseInt(s1);
		number2 = Integer.parseInt(s2);
		
		System.out.printf("두수의 합은 %d 입니다", number1+number2);
		scanner.close();
	}

}

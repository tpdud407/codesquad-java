package codesquad.calendar;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		System.out.println("�� ���� �Է��ϼ���.");
		Scanner scanner = new Scanner(System.in);
		int number1, number2;
		String s1,s2;
		s1 = scanner.next();
		s2 = scanner.next();
		number1 = Integer.parseInt(s1);
		number2 = Integer.parseInt(s2);
		
		System.out.printf("�μ��� ���� %d �Դϴ�", number1+number2);
		scanner.close();
	}

}

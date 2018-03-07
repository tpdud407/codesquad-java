package codesquad.calendar;

import java.util.Scanner;

public class Calendar {

	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}
	
	public static void printCalendar(int year,int month){
		System.out.printf("   <<%4d년%3d월>>\n ",year,month);
		System.out.println("  일 월 화 수 목 금 토");
		System.out.println(" --------------------");
		
		int maxDay = getMaxDaysOfMonth(month);
		
		for(int i =1; i<maxDay+1; i++){
			System.out.printf("%3d",i);
			if(i%7==0){
				System.out.println();
			}
		}
	}

//	public static void main(String[] args) {
//		
//
//		String PROMPT ="cal> ";
//		Scanner scanner = new Scanner(System.in);
//
//		while (true) {
//			System.out.println("월을 입력하세요.");
//			System.out.print(PROMPT);
//			int month = scanner.nextInt();
//			
//			if(month>12){
//				continue;
//			}
//			
//			if(month != -1){
//				Calendar.printCalendar(2017, month);
//				System.out.println();
//			}else{
//				System.out.println("Have a nice day!");
//				break;
//			}
//		}
//
//		scanner.close();
//	}

}

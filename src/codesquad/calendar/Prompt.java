package codesquad.calendar;

import java.util.Scanner;

public class Prompt {
	
	public int parsDay(String weekday){
		if(weekday.equals("su")) return 0;
		else if(weekday.equals("mo")) return 1;
		else if(weekday.equals("tu")) return 2;
		else if(weekday.equals("we")) return 3;
		else if(weekday.equals("th")) return 4;
		else if(weekday.equals("fr")) return 5;
		else if(weekday.equals("sa")) return 6;
		else
			return 0;
	}
	
	public void runPrompt(){
		Scanner scanner = new Scanner(System.in);

		int year = 1;
		int month = 0;
		int weekday = 0;
		
		while (true) {
			System.out.println("년도를 입력하세요.(-1종료)");
			System.out.println("YEAR> ");
			year = scanner.nextInt();
			if(year==-1){
				System.out.println("bye!");
				break;
			}
			
			System.out.println("월을 입력하세요.");
			System.out.print("MONTH> ");
			month = scanner.nextInt();
			System.out.println("첫번째 요일을 입력하세요.(su,mo,tu,we,th,fr,sa)");
			System.out.println("WEEK> ");
			String str_weekday = scanner.next();
			weekday=parsDay(str_weekday);
			
			
			
			if(month>12 || month<1){
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			
			if(year != -1){
				Calendar.printCalendar(year, month,weekday);
				System.out.println();
			}else{
				System.out.println("Have a nice day!");
				break;
			}
		}
		scanner.close();
	}

	public static void main(String[] args) {
		Prompt prompt = new Prompt();
		prompt.runPrompt();

	}

}

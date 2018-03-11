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
			System.out.println("�⵵�� �Է��ϼ���.(-1����)");
			System.out.println("YEAR> ");
			year = scanner.nextInt();
			if(year==-1){
				System.out.println("bye!");
				break;
			}
			
			System.out.println("���� �Է��ϼ���.");
			System.out.print("MONTH> ");
			month = scanner.nextInt();
			System.out.println("ù��° ������ �Է��ϼ���.(su,mo,tu,we,th,fr,sa)");
			System.out.println("WEEK> ");
			String str_weekday = scanner.next();
			weekday=parsDay(str_weekday);
			
			
			
			if(month>12 || month<1){
				System.out.println("�߸��� �Է��Դϴ�.");
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

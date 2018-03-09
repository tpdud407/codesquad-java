package codesquad.calendar;

import java.util.Scanner;

public class Prompt {
	
	private static final String PROMPT="cal> ";
	
	public void runPrompt(){
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("�⵵�� �Է��ϼ���.");
			System.out.println("YEAR> ");
			int year = scanner.nextInt();
			System.out.println("���� �Է��ϼ���.");
			System.out.print(PROMPT);
			int month = scanner.nextInt();
			
			
			
			if(month>12){
				continue;
			}
			
			if(year != -1){
				Calendar.printCalendar(year, month);
				System.out.println();
			}else{
				System.out.println("Have a nice day!");
				break;
			}
		}
	}

	public static void main(String[] args) {
		Prompt prompt = new Prompt();
		prompt.runPrompt();

	}

}

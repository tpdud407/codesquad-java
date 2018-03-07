package codesquad.calendar;

import java.util.Scanner;

public class Prompt {
	
	private static final String PROMPT="cal> ";
	
	public void runPrompt(){
		String PROMPT ="cal> ";
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("월을 입력하세요.");
			System.out.print(PROMPT);
			int month = scanner.nextInt();
			
			if(month>12){
				continue;
			}
			
			if(month != -1){
				Calendar.printCalendar(2017, month);
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

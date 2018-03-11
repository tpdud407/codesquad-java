package codesquad.calendar;

public class Calendar {

	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final int[] LEAP_MAX_DAYS = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	
	public static boolean isLeapYear(int year){
		if(year % 4 ==0 && (year % 100 != 0 || year % 400 ==0))
			return true;
		return false;
	}
	
	public static int getMaxDaysOfMonth(int year,int month) {
		if(isLeapYear(year))
			return LEAP_MAX_DAYS[month -1];
		return MAX_DAYS[month - 1];
	}
	
	public static void printCalendar(int year,int month,int weekday){
		System.out.printf("   <<%4d��%3d��>>\n ",year,month);
		System.out.println("  �� �� ȭ �� �� �� ��");
		System.out.println(" --------------------");
		
		for(int i =0; i<weekday; i++){
			System.out.print("   ");
		}
		
		int maxDay = getMaxDaysOfMonth(year,month);
		int count = 7-weekday;
		int delim= count;
		
		if(count < 7){
			delim=count;
		}else{
			delim=0;
		}
		
		for(int i = 1; i<=count; i++){
			System.out.printf("%3d",i);
		}
		System.out.println();
		count++;
		
		for(int i =count; i<=maxDay; i++){
			System.out.printf("%3d",i);
			if(i%7 == delim){
				System.out.println();
			}
		}
	}

}

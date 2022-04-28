package kr.human.java0427;

import java.util.Calendar;

//4월 19일 ex08
public class Calender_0427_ex {
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);

		System.out.println("---------["+year+"년 "+month+"월]---------");
		System.out.println("  일  월  화  수  목  금  토");

		cal.set(year,month-1,1);
		int end = cal.getActualMaximum(Calendar.DATE);//해당 월 마지막 날짜
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);//해당 날짜의 요일(1:일요일 … 7:토요일)

		for(int i=1; i<=end; i++) { 
			if(i == 1) { 
				for(int j=1; j<dayOfWeek; j++) { 
					System.out.print("    "); 
					} 
				} 
			if(i<10) {//한자릿수일 경우 공백을 추가해서 줄맞추기
				System.out.print(" ");
			}
			System.out.print(" " + i + " "); 
			if(dayOfWeek % 7 == 0) {//한줄에 7일씩 출력
				System.out.println();
			}
			dayOfWeek++;
		}
		System.out.println("-----------------------------");
	}
}

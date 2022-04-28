package kr.human.java0427;

import java.util.Calendar;
import java.util.Scanner;

//4월 19일 ex08
public class Calender_0427_ex3 {
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("년도를 입력하세요 : "); 
		int year = sc.nextInt(); //년도 

		for(int t = 0; t < 12; t++) {
			System.out.println("--------["+year+"년 "+(t+1)+"월]--------");
			System.out.println("  일  월  화  수  목  금  토");
			
			cal.set(year,t,1);
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
			System.out.println("\n-----------------------------");
		}
		
	}
}

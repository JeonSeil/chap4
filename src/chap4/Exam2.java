package chap4;

import java.util.Scanner;

/*
 * 년도를 4자리로 입력받아 윤년 구하기
 * 4로나누어 떨어지는 년도  중
 *  100의 배수이면서 400의 배수인 경우는 윤년
 *  100의 배수이면서 400의 배수가 아닌 경우는 평년
 *  100의 배수가 아니면 윤년
 *  
 * 4의 배수가 아니면 평년
 * 
 * 년도를 입력하세요
 * 2001
 * 평년입니다.
 * 
 * 년도를 입력하세요
 * 2016
 * 윤년입니다.
 *
 * 년도를 입력하세요
 * 2100
 * 평년입니다.
 */
public class Exam2 {
	public static void main(String[] args) {
		System.out.println("년도를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();

		if ( year % 4 == 0) {
			if(year%400 == 0 ) {
				System.out.println("윤년입니다.");
			} else if(year%100 == 0) {
				System.out.println("평년입니다.");
			} else {
			  System.out.println("윤년입니다.");
			}
		} else {
			System.out.println("평년입니다.");
		}
	}
}
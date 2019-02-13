package chap4;

import java.util.Scanner;

/*
 * 한개의 문자를 입력받아서 대문자인지, 소문자인지, 숫자인지, 기타 문자인지 출력하기
 * [예1]
 * 한개의 문자를 입력하세요
 * A
 * 대문자입니다.
 * [예2]
 * 한개의 문자를 입력하세요
 * c
 * 소문자입니다.
 * [예3]
 * 한개의 문자를 입력하세요
 * 6
 * 숫자입니다.
 * [예4]
 * 한개의 문자를 입력하세요
 * !
 * 기타문자입니다.
 */
public class Exam1 {
	public static void main(String[] args) {
		System.out.println("한개의 문자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		char ch = scan.next().charAt(0);
		if(ch >= 'A' && ch <= 'Z') {
			System.out.println("대문자입니다.");
		} else if (ch >= 'a' && ch <= 'z') {
			System.out.println("소문자입니다.");
		} else if (ch >= '0' && ch <= '9') {
			System.out.println("숫자입니다.");
		} else {
			System.out.println("기타 문자입니다.");
		}
	}
}

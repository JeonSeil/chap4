package chap4;

import java.util.Scanner;

//숫자를 입력받아서 양수,음수, 0 인지 출력하기. 
public class IfEx2 {
	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if(num > 0) {
			System.out.println("양수입니다.");
		} else if (num < 0) {
			System.out.println("음수입니다.");
		} else {
			System.out.println("0 입니다.");
		}
		//조건 연산자
		System.out.println((num>0)?"양수입니다.":
	 	                   (num<0)?"음수입니다.":"0 입니다.");
	}
}

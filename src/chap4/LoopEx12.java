package chap4;

import java.util.Scanner;

/*
 * 화면에서 숫자로 이루어진 문자를 입력받아 각각의 자리수의 합을 구하기
 * 문자열의 길이 : String length() 메서드
 * [예1]
 * "123456"  
 * 자리수의 합 : 21
 *
 * [예2]
 * "123*456"  
 * 숫자아님
 */
public class LoopEx12 {
	public static void main(String[] args) {
		System.out.println("숫자들을 입력하세요");
		Scanner scan = new Scanner(System.in);
		String value = scan.next();
		char ch;
		boolean isNum = true;
		for(int i=0;i < value.length();i++) {
			ch = value.charAt(i);
			if( ch < '0' || ch > '9') {  //숫자 아님
				isNum = false;
				break;
			}
		}
		int sum = 0;
		if(isNum) {
			for(int i=0;i < value.length();i++) {
				ch = value.charAt(i);
				sum += ch-'0';
			}
			System.out.println("자리수 합계 :" + sum);
		} else {
			System.out.println("숫자 아님");
		}
	}
}

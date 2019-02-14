package chap4;

import java.util.Scanner;

/*
 * 입력받은 숫자가 회문수 인지 판단하는 프로그램 
 * 
 * 12321 : 회문수
 * 12345 : 회문수아님
 */
public class LoopEx16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = scan.nextInt();
		int tmp = num; //0
		int result = 0; //321
		while(tmp != 0) { 
			result *=10;        
			result += tmp % 10; 
			tmp /=10;           
		}
		if(num == result) {
			System.out.println(num + "는 회문수");
		} else {
			System.out.println(num + "는 회문수 아님");
		}
	}
}

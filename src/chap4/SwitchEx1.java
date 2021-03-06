package chap4;

import java.util.Scanner;

/*
 * switch 구문
 * switch(값) {
 *    case 값1 : 문장;
 *    case 값2 : 문장;
 *    ...
 *    default : 문장 n;
 * }
 */
public class SwitchEx1 {
	public static void main(String[] args) {
		System.out.println("점수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt(); //75
		String grade;
		switch (score / 10) {
		   case 10:
		   case 9: if (score > 0) System.out.println("양수");
			       grade = "A";
		           break;  //switch 구분을 벗어남

		   case 8: grade = "B";break;
		   case 7: grade = "C";break;
		   case 6: grade = "D";break;
		   default : grade = "F";break;
		}
		System.out.println(score + "점수는 " + grade + "학점 입니다.");
	}
}

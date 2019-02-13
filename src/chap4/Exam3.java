package chap4;

import java.util.Scanner;

/*
 * 점수를 입력받아 60이상이면 합격, 아니면 불합격 출력하기. 반드시 switch 구문을 이용하여 작성하기
 */
public class Exam3 {
	public static void main(String[] args) {
		System.out.println("점수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		String grade;
		switch (score / 10) {
		   case 10:
		   case 9: 
		   case 8: 
		   case 7: 
		   case 6: grade = "합격";break;
		   default : grade = "불합격";
		}
		System.out.println(score + "점수는 " + grade + "입니다.");

	}
}

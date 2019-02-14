package chap4;

import java.util.Scanner;
/*
 * 1부터 100까지의 임의의 숫자 맞추기 프로그램 작성하기
 * 
 * 컴퓨터가 저장 숫자 : Math.random()
 */
public class LoopEx15 {
	public static void main(String[] args) {
		int ans = (int)(Math.random() * 100) + 1; //1부터 100까지의 임의의 수 저장
		Scanner scan = new Scanner(System.in);
		int cnt=0;  //입력받은 횟수 저장
		while(true) {
			System.out.println("1부터 100까지의 사이의 숫자를 입력하세요");
			int num = scan.nextInt();
			cnt++;
			if(num >  ans) {
				System.out.println("더 작은 수를 입력하세요");
			} else if (num < ans) {
				System.out.println("더 큰 수를 입력하세요");
			} else {
				System.out.println("정답입니다.");
				System.out.println("시도 횟수:"+cnt);
				break;
			}
		}		
	}
}

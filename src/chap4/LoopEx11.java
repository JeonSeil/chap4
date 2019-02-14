package chap4;

import java.util.Scanner;

/*
 * 강아지, 병아리의 합과 다리수의 합을 입력받아서 
 * 강아지의 마리수와 병아리의 마리수를 출력하기.
 * 계산이 안될 경우 정답없음 출력하기.
 * x + y = 마리수의 합
 * 4x + 2y = 다리수 합
 */
public class LoopEx11 {
	public static void main(String[] args) {
		System.out.println("강아지와 병아리 의 합계를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int acnt = scan.nextInt();
		System.out.println("강아지와 병아리 의 다리의 합계를 입력하세요");
		int lcnt = scan.nextInt();
		boolean search = false;
		for(int d=0;d<=acnt;d++) {
			for(int c=0;c<=acnt;c++) {
				if(((d+c)==acnt) && (d*4+c*2==lcnt)) {
					System.out.println("강아지는" + d + "마리이고, 병아리는" + c + "마리입니다.");
					search = true;
				}
			}
		}
		if(!search)
			System.out.println("정답 없음");
	}
}

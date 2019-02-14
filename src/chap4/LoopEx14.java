package chap4;

import java.util.Scanner;

/*
 * 화면에서 숫자를 99999 값이 입력될때 까지 입력받아
 * 입력된 숫자의 합과 평균을 구하기.
 * [예1]
 * 숫자를 입력하세요
 * 10
 * 숫자를 입력하세요
 * 20
 * 숫자를 입력하세요
 * 99999
 *
 * 총합 : 30 평균 : 15
 */
public class LoopEx14 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum=0,cnt=0;
		while(true) {
			System.out.println("숫자를 입력하세요(종료:99999)");
			int num = scan.nextInt();
			if(num == 99999) break;
			sum += num;
			cnt++;
		}
		System.out.println("총합:" + sum + ",평균:" + (double)sum/cnt);
	}
}

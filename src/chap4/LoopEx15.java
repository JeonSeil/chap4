package chap4;

import java.util.Scanner;
/*
 * 1���� 100������ ������ ���� ���߱� ���α׷� �ۼ��ϱ�
 * 
 * ��ǻ�Ͱ� ���� ���� : Math.random()
 */
public class LoopEx15 {
	public static void main(String[] args) {
		int ans = (int)(Math.random() * 100) + 1; //1���� 100������ ������ �� ����
		Scanner scan = new Scanner(System.in);
		int cnt=0;  //�Է¹��� Ƚ�� ����
		while(true) {
			System.out.println("1���� 100������ ������ ���ڸ� �Է��ϼ���");
			int num = scan.nextInt();
			cnt++;
			if(num >  ans) {
				System.out.println("�� ���� ���� �Է��ϼ���");
			} else if (num < ans) {
				System.out.println("�� ū ���� �Է��ϼ���");
			} else {
				System.out.println("�����Դϴ�.");
				System.out.println("�õ� Ƚ��:"+cnt);
				break;
			}
		}		
	}
}

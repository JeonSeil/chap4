package chap4;

import java.util.Scanner;

/*
 * ȭ�鿡�� ���ڸ� 99999 ���� �Էµɶ� ���� �Է¹޾�
 * �Էµ� ������ �հ� ����� ���ϱ�.
 * [��1]
 * ���ڸ� �Է��ϼ���
 * 10
 * ���ڸ� �Է��ϼ���
 * 20
 * ���ڸ� �Է��ϼ���
 * 99999
 *
 * ���� : 30 ��� : 15
 */
public class LoopEx14 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum=0,cnt=0;
		while(true) {
			System.out.println("���ڸ� �Է��ϼ���(����:99999)");
			int num = scan.nextInt();
			if(num == 99999) break;
			sum += num;
			cnt++;
		}
		System.out.println("����:" + sum + ",���:" + (double)sum/cnt);
	}
}

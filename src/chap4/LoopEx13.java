package chap4;

import java.util.Scanner;

/*
 * ȭ�鿡�� ������ �Է¹޾Ƽ� ������ �ڸ����� ���� ���ϱ�. �� ���ڿ��� ���� �ʱ�.
 * 
 * [��1]
 * ���ڸ� �Է��ϼ���
 * 123
 * �ڸ����� �� : 6
 *
 * [��2]
 * ���ڸ� �Է��ϼ���
 * 1357
 * �ڸ����� �� : 16
 */
public class LoopEx13 {
	public static void main(String[] args) {
		System.out.println("���ڸ� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int sum = 0;
		while(num != 0) {
			sum += num % 10;
			num /= 10;
		}
		System.out.println("�ڸ��� �հ� :" + sum);
	}
}
